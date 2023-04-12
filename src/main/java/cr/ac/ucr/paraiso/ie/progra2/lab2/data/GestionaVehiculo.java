package cr.ac.ucr.paraiso.ie.progra2.lab2.data;

import java.io.*;

public class GestionaVehiculo {
    public void generaArchivoFileWriter(String path) {
        File archivo = new File(path);
        try {
            FileWriter imprimir = new FileWriter(archivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ingresaVehiculo(String path, String vehiculo) {
        File archivo = new File(path);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            buffer.append("\n").append(vehiculo);
            System.out.println("Se agrego el nuevo vehículo al reporte");
            System.out.println(vehiculo);
            buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

//    private boolean buscar(String serial, String path) throws IOException {
//        File archivo = new File(path);
//        String dato = "";
//        boolean encontrado = false;
//        try {
//            BufferedReader BR = new BufferedReader(new FileReader(archivo));
//
//            while ((dato = BR.readLine()) != null) {
//
//                if (dato.equalsIgnoreCase(serial)) {
//                    System.out.println(dato);
//
//                    for (int i = 0; i < 2; i++) {
//                        System.out.println(BR.readLine());
//                    }
//                    encontrado = true;
//                    break;
//                }
//            }
//        } catch (IOException e) {
//
//            System.out.println("Error");
//        }
//
//        return encontrado;
//    }

//    public void modificar(String serial, String vehiculo, String path) {
//
//
}
