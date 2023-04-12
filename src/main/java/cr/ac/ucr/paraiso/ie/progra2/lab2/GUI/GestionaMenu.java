package cr.ac.ucr.paraiso.ie.progra2.lab2.GUI;

import cr.ac.ucr.paraiso.ie.progra2.lab2.model.CargaLigera;
import cr.ac.ucr.paraiso.ie.progra2.lab2.model.CargaPesada;
import cr.ac.ucr.paraiso.ie.progra2.lab2.model.Liviano;
import cr.ac.ucr.paraiso.ie.progra2.lab2.model.Motocicleta;

import java.util.Scanner;

public class GestionaMenu {
    public static void main(String[] args) {
        int tipoVehiculo;
        String serial, color, modelo;
        int motor, valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido!\nSistema de Control Aduanero\nSeleccione lo que desea hacer");
        System.out.println("1)Ingresar un vehículo \t\t2)Modificar un vehículo\n3)Eliminar un vehículo\t\t4)Imprimir el reporte\n5)Salir");
        int accion = scanner.nextInt();

        switch (accion) {

//******************** INGRESAR UN VEHÍCULO ********************
            case 1:
                System.out.println("Seleccione el tipo de vehículo a ingresar\n1)Carga Pesada\t\t2)Carga Ligera\n" +
                        "3)Liviano\t\t4)Motocicleta");
                tipoVehiculo = scanner.nextInt();
                switch (tipoVehiculo) {
                    //******************** VEHÍCULO DE CARGA PESADA ********************
                    case 1:
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
                        CargaPesada cargaPesada = new CargaPesada(serial, motor, color, modelo, valor, tonelaje, tipoCarga);
                        scanner.close();
                        break;
                    //******************** VEHÍCULO DE CARGA lIGERA ********************
                    case 2:
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
                        CargaLigera cargaLigera = new CargaLigera(serial, motor, color, modelo, valor, tiene);
                        scanner.close();
                        break;
                    //******************** VEHÍCULO LIVIANO ********************
                    case 3:
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
                        Liviano liviano = new Liviano(serial, motor, color, modelo, valor, pasajeros);
                        scanner.close();
                        break;
                    //******************** MOTOCICLETA ********************
                    case 4:
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
                        Motocicleta motocicleta = new Motocicleta(serial, motor, color, modelo, valor, clasificacion);
                        scanner.close();
                        break;
                }
                break;

//******************** MODIFICAR UN VEHÍCULO ********************
            case 2:
                System.out.println("Seleccione el tipo de vehículo a modificar\n1)Carga Pesada\t\t2)Carga Ligera\n" +
                        "3)Liviano\t\t4)Motocicleta");
                tipoVehiculo = scanner.nextInt();
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
}
