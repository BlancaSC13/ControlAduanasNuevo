package cr.ac.ucr.paraiso.ie.progra2.lab2;

import java.io.*;

public class GestionaArchivo {
    public void generaArchivoFileWriter(String path) {
        File archivo = new File(path);
        try {
            FileWriter imprimir = new FileWriter(archivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void nuevoVehiculo(String path, String vehiculo) {
        File archivo = new File(path);
        try {
            FileWriter imprimir = new FileWriter(archivo, true);
            imprimir.append("\n").append(vehiculo);
            imprimir.close();
            System.out.println("Se agrego el nuevo vehículo al reporte");
            System.out.println(vehiculo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void nuevoVehiculoBuffer(String path, String vehiculo) {
        File archivo = new File(path);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            buffer.append("\n").append(vehiculo);
            System.out.println("Se agrego el nuevo vehículo al reporte");
            System.out.println(vehiculo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerVehiculos(String path) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(path);

        try (BufferedReader rd = new BufferedReader(new FileReader(archivo))) {
            String ln;
            while ((ln = rd.readLine()) != null) {
                sb.append(ln).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }


}