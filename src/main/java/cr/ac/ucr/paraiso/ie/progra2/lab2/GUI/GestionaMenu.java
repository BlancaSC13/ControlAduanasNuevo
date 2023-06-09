package cr.ac.ucr.paraiso.ie.progra2.lab2.GUI;

import cr.ac.ucr.paraiso.ie.progra2.lab2.data.GestionaVehiculo;
import cr.ac.ucr.paraiso.ie.progra2.lab2.model.CargaLigera;
import cr.ac.ucr.paraiso.ie.progra2.lab2.model.CargaPesada;
import cr.ac.ucr.paraiso.ie.progra2.lab2.model.Liviano;
import cr.ac.ucr.paraiso.ie.progra2.lab2.model.Motocicleta;

import java.io.IOException;
import java.util.Scanner;

public class GestionaMenu {
    String serial, color, modelo;
    int motor, valor;
    GestionaVehiculo gestionaVehiculo = new GestionaVehiculo();
    Scanner scanner = new Scanner(System.in);
    String vehiculo = "";
    String path = "C:\\Users\\Blanca Segura\\IdeaProjects\\ControlAduanasNuevo\\controlVehiculos.txt";

    public void Menu(int accion){
        int tipoVehiculo;
        switch (accion) {
//******************** INGRESAR UN VEHÍCULO ********************
            case 1:
                System.out.println("Seleccione el tipo de vehículo a ingresar\n1)Carga Pesada\t\t2)Carga Ligera\n" +
                        "3)Liviano\t\t4)Motocicleta");
                tipoVehiculo = scanner.nextInt();
                switch (tipoVehiculo) {
                    case 1:
                        vehiculo = datosCargaPesada();
                        gestionaVehiculo.ingresaVehiculo(path, vehiculo);
                        break;
                    case 2:
                        vehiculo = datosCargaLigera();
                        gestionaVehiculo.ingresaVehiculo(path, vehiculo);
                        break;
                    case 3:
                        vehiculo = datosLiviano();
                        gestionaVehiculo.ingresaVehiculo(path, vehiculo);
                        break;
                    case 4:
                        vehiculo = datosMotocicleta();
                        gestionaVehiculo.ingresaVehiculo(path, vehiculo);
                        break;
                    default:
                        System.out.println("El número ingresado es incorrecto");
                        break;
                }
                break;

//******************** MODIFICAR UN VEHÍCULO ********************
            case 2:
                System.out.println("Seleccione el tipo de vehículo a modificar\n1)Carga Pesada\t\t2)Carga Ligera\n" +
                        "3)Liviano\t\t4)Motocicleta");
                tipoVehiculo = scanner.nextInt();
                switch (tipoVehiculo){
                    case 1:
                        System.out.println("Digite el serial del vehiculo a modificar");
                        String numSerial = scanner.next();
                        String dato = datosCargaPesada();
                     //   gestionaVehiculo.modificar(numSerial,dato,path);

                }
                break;

//******************** ELIMINAR UN VEHÍCULO ********************
            case 3:
                System.out.println("Seleccione el tipo de vehículo a eliminar\n1)Carga Pesada\t\t2)Carga Ligera\n" +
                        "3)Liviano\t\t4)Motocicleta");
                tipoVehiculo = scanner.nextInt();
                break;

//******************** IMPRIMIR EL REPORTE ********************
            case 4:
                System.out.println("Seleccione el tipo de vehículo para imprimir el reporte\n1)Carga Pesada\t\t2)Carga Ligera\n" +
                        "3)Liviano\t\t4)Motocicleta");
                tipoVehiculo = scanner.nextInt();
                break;
        }

    }


    public String datosCargaPesada() {
        System.out.println("Ingrese el número de serie del vehículo");
        serial = scanner.next();
        System.out.println("Ingrese el número de motor del vehículo");
        motor = scanner.nextInt();
        System.out.println("Ingrese el color del vehículo");
        color = scanner.next();
        System.out.println("Ingrese el modelo del vehículo");
        modelo = scanner.next();
        System.out.println("Ingrese el valor del vehículo");
        valor = scanner.nextInt();
        System.out.println("Ingrese el peso en toneladas del vehículo");
        int tonelaje = scanner.nextInt();
        System.out.println("Ingrese el tipo de carga pesada\n1)Americano\t\t2)Europeo");
        int tipoCarga = scanner.nextInt();
        CargaPesada CP = new CargaPesada(serial, motor, color, modelo, valor, tonelaje, tipoCarga);
        scanner.close();
        return CP.toString();
    }

    public String datosCargaLigera() {
        System.out.println("Ingrese el número de serie del vehículo");
        serial = scanner.next();
        System.out.println("Ingrese el número de motor del vehículo");
        motor = scanner.nextInt();
        System.out.println("Ingrese el color del vehículo");
        color = scanner.next();
        System.out.println("Ingrese el modelo del vehículo");
        modelo = scanner.next();
        System.out.println("Ingrese el valor del vehículo");
        valor = scanner.nextInt();
        System.out.println("Digite 1 si el vehículo posee frigorífico o 2 si no lo posee");
        int frigorífico = scanner.nextInt();
        boolean tiene = false;
        if (frigorífico == 1) {
            tiene = true;
        }
        CargaLigera CL = new CargaLigera(serial, motor, color, modelo, valor, tiene);
        scanner.close();

        return CL.toString();
    }

    public String datosLiviano() {
        System.out.println("Ingrese el número de serie del vehículo");
        serial = scanner.next();
        System.out.println("Ingrese el número de motor del vehículo");
        motor = scanner.nextInt();
        System.out.println("Ingrese el color del vehículo");
        color = scanner.next();
        System.out.println("Ingrese el modelo del vehículo");
        modelo = scanner.next();
        System.out.println("Ingrese el valor del vehículo");
        valor = scanner.nextInt();
        System.out.println("Ingrese la capacidad de pasajeros del vehículo");
        int pasajeros = scanner.nextInt();
        scanner.close();
        Liviano liviano = new Liviano(serial, motor, color, modelo, valor, pasajeros);
        return liviano.toString();
    }

    public String datosMotocicleta() {
        System.out.println("Ingrese el número de serie del vehículo");
        serial = scanner.next();
        System.out.println("Ingrese el número de motor del vehículo");
        motor = scanner.nextInt();
        System.out.println("Ingrese el color del vehículo");
        color = scanner.next();
        System.out.println("Ingrese el modelo del vehículo");
        modelo = scanner.next();
        System.out.println("Ingrese el valor del vehículo");
        valor = scanner.nextInt();
        System.out.println("Digite la clasificación de su motocicleta\n1)Scooter\t\t2)Turismo\n3)Superdeportiva");
        int clasificacion = scanner.nextInt();
        scanner.close();
        Motocicleta motocicleta = new Motocicleta(serial, motor, color, modelo, valor, clasificacion);
        return motocicleta.toString();
    }
}
