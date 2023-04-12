package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

import org.junit.jupiter.api.Test;

public class MotocicletaTest {
    @Test
    public void llamada_toString_Funciona() {
        Motocicleta motocicletaScooter = new Motocicleta("sc1233", 125, "verde", "Suzuki", 5000, 1);
        System.out.println(motocicletaScooter.toString());

        Motocicleta motocicletaTurismo = new Motocicleta("tu1234'", 125, "roja", "Yamaha", 10000, 2);
        System.out.println(motocicletaTurismo.toString());

        Motocicleta motocicletaSuperdeportiva = new Motocicleta("su1233", 300, "azul", "Honda", 15000, 3);
        System.out.println(motocicletaSuperdeportiva.toString());
    }
}
