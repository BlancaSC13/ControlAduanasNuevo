package cr.ac.ucr.paraiso.ie.progra2.lab2.model;

import org.junit.jupiter.api.Test;

public class CargaLivianaTest {
    @Test
    public void llamada_toString_funciona() {
        Liviano capacidadDos = new Liviano("SE1233", 2000, "'Verde", "Nissan", 20000, 2);
        Liviano capacidadMayor = new Liviano("SV1233", 2000, "'Rojo", "Mitsubishi", 45000, 7);
        System.out.println("Vehículo Liviano" + capacidadDos.toString());
        System.out.println("Vehículo Liviano" + capacidadMayor.toString());
    }
}
