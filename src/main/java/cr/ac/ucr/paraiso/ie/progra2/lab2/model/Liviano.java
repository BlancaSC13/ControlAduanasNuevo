package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

public class Liviano extends Vehiculo {
    private int capacidadPasajeros;

    public Liviano(String serial, int motor, String color, String modelo, int valor, int capacidadPasajeros) {
        super(serial, motor, color, modelo, valor);
        this.capacidadPasajeros = capacidadPasajeros;
        this.calculaTax();
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void calculaTax() {
        if (capacidadPasajeros == 2) {
            super.setTax(super.getValor() * 0.10f);
        } else {
            super.setTax((float) (super.getValor() * (((capacidadPasajeros - 2) * 0.02) + 0.10f)));
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Capacidad de pasajeros: " + capacidadPasajeros;
    }
}
