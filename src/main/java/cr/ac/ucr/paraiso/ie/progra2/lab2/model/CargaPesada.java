package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

public class CargaPesada extends Vehiculo {
    private int tonelaje;
    private int tipoCargaPesada;

    public CargaPesada(String serial, int motor, String color, String modelo, int valor, int tonelaje, int tipoCargaPesada) {
        super(serial, motor, color, modelo, valor);
        this.tonelaje = tonelaje;
        this.tipoCargaPesada = tipoCargaPesada;
        this.calculaTax();

    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public int getTipoCargaPesada() {
        return tipoCargaPesada;
    }

    public void setTipoCargaPesada(int tipoCargaPesada) {
        this.tipoCargaPesada = tipoCargaPesada;
    }

    @Override
    public void calculaTax() {
        super.setTax(this.tonelaje * 20);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tonelaje=" + tonelaje +
                ", tipoCargaPesada=" + tipoCargaPesada;
    }
}
