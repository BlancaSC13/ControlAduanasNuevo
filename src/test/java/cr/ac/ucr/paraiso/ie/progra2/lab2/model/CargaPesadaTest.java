package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

import org.junit.jupiter.api.Test;

public class CargaPesadaTest {
    @Test
    public void llamada_toString_funciona(){
        CargaPesada americano = new CargaPesada("Co5905", 3000, "Verde", "Kenworth", 15000, 20,1);
        CargaPesada europeo = new CargaPesada("Co5759", 3000, "Azul", "Iveco",500000, 10,2);
        System.out.println("\nRegistro Camión Americano\n" + americano.toString());
        System.out.println("\nRegistro Camión Europeo\n" + europeo.toString());
    }
}
