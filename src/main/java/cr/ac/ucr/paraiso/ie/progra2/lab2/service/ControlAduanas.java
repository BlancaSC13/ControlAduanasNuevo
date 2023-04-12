package cr.ac.ucr.paraiso.ie.progra2.lab2.service;

import cr.ac.ucr.paraiso.ie.progra2.lab2.GUI.GestionaMenu;

import java.util.Scanner;

public class ControlAduanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido!\nSistema de Control Aduanero\nSeleccione lo que desea hacer");
        System.out.println("1)Ingresar un vehículo \t\t2)Modificar un vehículo\n3)Eliminar un vehículo\t\t4)Imprimir el reporte\n5)Salir");
        int accion = scanner.nextInt();
        GestionaMenu gestionaMenu = new GestionaMenu();
        gestionaMenu.Menu(accion);
    }
}
