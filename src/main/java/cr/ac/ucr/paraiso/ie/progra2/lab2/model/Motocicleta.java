package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

public class Motocicleta extends Vehiculo {
    private int clasificacion;


    public Motocicleta(String serial, int motor, String color, String modelo, int valor, int clasificacion) {
        super(serial, motor, color, modelo, valor);
        this.clasificacion = clasificacion;

    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public void calculaTax() {
        switch (clasificacion) {
            case 1:
                super.setTax(super.getValor() * 0.20f);
                break;
            case 2:
                super.setTax(super.getValor() * 0.25f);
                break;
            case 3:
                super.setTax(super.getValor() * 0.30f);
                break;
        }

    }

    @Override
    public String toString() {
        String nombreClasificación = "";
        switch (this.clasificacion) {
            case 1:
                nombreClasificación = "Scooter";
                break;
            case 2:
                nombreClasificación = "Turismo";
                break;
            case 3:
                nombreClasificación = "Superdeportiva";
                break;

        }
        return super.toString() + "Clasificación: " + nombreClasificación;
    }
}
