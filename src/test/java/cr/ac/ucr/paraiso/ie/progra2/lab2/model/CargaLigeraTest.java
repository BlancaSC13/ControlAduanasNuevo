package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

import org.junit.jupiter.api.Test;

public class CargaLigeraTest {
    @Test
    public void llamada_toString_funciona() {
        CargaLigera cargaLigera = new CargaLigera("Co5905", 1200, "Verde", "Kenworth", 15000, true);
        CargaLigera cargaLigera2 = new CargaLigera("Co5905", 1200, "Verde", "Kenworth", 15000, false);
        System.out.println("\nRegistro Camion" + cargaLigera);
        System.out.println("\nRegistro Camion" + cargaLigera2);
    }
}
