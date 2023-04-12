package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

public class Vehiculo {
    private String serial;
    private int motor;
    private String color;
    private String modelo;
    private int valor;
    private float tax;

    public Vehiculo(String serial, int motor, String color, String modelo, int valor) {
        this.serial = serial;
        this.motor = motor;
        this.color = color;
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public void calculaTax() {
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "\nserial='" + serial + '\'' +
                ", motor=" + motor +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor=" + valor + '\'' +
                ", tax=" + tax + '\'';
    }
}
