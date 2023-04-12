package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

public class CargaLigera extends Vehiculo{
    private boolean tipoContenedor;

    public CargaLigera(String serial, int motor, String color, String modelo, int valor, boolean frigorifico) {
        super(serial, motor, color, modelo, valor);
        this.tipoContenedor = frigorifico;
        this.calculaTax();
    }

    public boolean isTipoContenedor() {
        return tipoContenedor;
    }

    public void setTipoContenedor(boolean tipoContenedor) {
        this.tipoContenedor = tipoContenedor;
    }

    @Override
    public void calculaTax() {
        super.setTax((this.tipoContenedor == false) ? super.getValor() * 0.15f : super.getValor() * 0.10f);


    }

    @Override
    public String toString() {
        return super.toString() +
                " Tipo Contenedor: " + (isTipoContenedor() ? "Tiene Frigorífico" : "No tiene frigorífico");
    }
}
