package cr.ac.ucr.paraiso.ie.progra2.lab2.data;

import cr.ac.ucr.paraiso.ie.progra2.lab2.model.Empleado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class EmpleadoDAO extends RandomAccessFile {
    private final int TAMANO_REGISTRO = 64; //suma total de las variables
    private final int TAMANO_ID_EMPLEADO = 4;
    private final int TAMANO_NOMBRE = 30;
    private final int TAMANO_APELLIDOS = 30;

    public EmpleadoDAO(File file) throws FileNotFoundException {
        super(file, "rw");
    }

    //método para saber si existe el registro
    public boolean buscar(int idEmpleadoBuscado)
            throws IOException { //funciona como un try-Catch
        boolean encontrado = false;
        int totalRegistros = (int) (this.length() / TAMANO_REGISTRO);
        int numReg = 0;
        while (numReg < totalRegistros && !encontrado) {
            this.seek(numReg * TAMANO_REGISTRO);//buscar una posición en el registro
            int idEmpleadoActual = this.readInt();//obtiene el empleado, obtiene la información que está en esa posición
            if (idEmpleadoBuscado == idEmpleadoActual)
                encontrado = !encontrado;
            else numReg++;

        }
        return encontrado;
    }

    /*
     * Inserta un empleado en el archivo. El nuevo empleado no puede
     * tener una identificación igual a uno que ya exista. Están ordenador alfabeticamente
     */

    //Regresa un registro con base en la posicion
    private String readString(int tamanoString, long posicion) throws IOException {
        this.seek(posicion);
        byte[] datos = new byte[tamanoString];
        this.readFully(datos);
        String dato = new String(datos).trim(); //remueve los espacios en blanco
        return dato;
    }

    //convertir String a un arreglo de bytes
    private byte[] toBytes(String dato, int tamanoString) {
        byte[] datos = new byte[tamanoString];
        byte temp[] = dato.getBytes();
        int i = 0;
        for (byte c : temp) {
            datos[i++] = c;
        }
        return datos;
    }

    public void insertarEmpleado(Empleado empInsertar) throws IOException, EmpleadoExistenteException {
        boolean encontrado = this.buscar(empInsertar.getIdEmpleado()); //Pregunta si el empleado existe
        if (encontrado)//Si existe
            throw new EmpleadoExistenteException();
        else {
            boolean insertado = false;
            int totalRegistros = (int) (this.length() / TAMANO_REGISTRO);
            int numReg = 0;
            while (numReg < totalRegistros && !insertado) {
                this.seek(numReg * TAMANO_REGISTRO);
                this.skipBytes(TAMANO_ID_EMPLEADO);
                String nombreActual =
                        readString(TAMANO_NOMBRE, this.getFilePointer());
                if (empInsertar.getNombre().compareTo(nombreActual) <= 0) {
                    this.setLength(this.length());
                    //mover los registros al final
                    for (int i = totalRegistros - 1; i >= numReg; i--) {
                        this.seek(i * TAMANO_REGISTRO);
                        byte[] registroX = new byte[TAMANO_REGISTRO];
                        //Los system.out.print son solo para guiar el proceso, al igual que el método leerBytes
                        System.out.println("Registro previo" + i);
                        leerBytes(registroX);
                        System.out.println("POS " + this.getFilePointer());
                        this.readFully(registroX);//lee y toma el registro
                        System.out.println("Registro ReadFully");
                        leerBytes(registroX);
                        System.out.println("POS " + this.getFilePointer());
                        this.write(registroX);//pega el registro en la nueva posición
                        System.out.println("Registro write");
                        leerBytes(registroX);
                        System.out.println("POS " + this.getFilePointer());
                    }
                    this.seek(numReg * TAMANO_REGISTRO);
                    System.out.println("POS " + this.getFilePointer());
                    this.write(empInsertar.getIdEmpleado());
                    this.write(
                            toBytes(empInsertar.getNombre(), TAMANO_NOMBRE));
                    insertado = true;
                } else ++numReg;
            }
            if (!insertado) {
                System.out.println("Primer insert");
                this.setLength(this.length() + TAMANO_REGISTRO);
                this.seek(this.length() - TAMANO_REGISTRO);
                System.out.println("POS " + this.getFilePointer());
                this.writeInt(empInsertar.getIdEmpleado());
                this.write(
                        toBytes(empInsertar.getNombre(), TAMANO_NOMBRE));
                this.write(
                        toBytes(empInsertar.getApellido(), TAMANO_APELLIDOS));
            }
        }
    }

    //para los test
    public ArrayList<Empleado> getEmpleados() throws IOException {
        int totalRegistros = (int) (this.length() / TAMANO_REGISTRO);
        ArrayList<Empleado> list = new ArrayList<Empleado>();
        for (int i = 0; i < totalRegistros; i++) {
            this.seek(i * TAMANO_REGISTRO);
            int idEmp = this.readInt();
            String nombre = this.readString(TAMANO_NOMBRE,
                    this.getFilePointer());
            String apellidos = this.readString(TAMANO_APELLIDOS,
                    this.getFilePointer());
            list.add(new Empleado(idEmp, nombre, apellidos));


        }//for

        return list;
    }

    //lo hace legible
    private void leerBytes(byte[] registroX) {
        for (byte b : registroX) {
            char c = (char) b;
            System.out.print(c);
        }
    }
}
