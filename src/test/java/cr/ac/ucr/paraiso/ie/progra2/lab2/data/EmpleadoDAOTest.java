package cr.ac.ucr.paraiso.ie.progra2.lab2.data;

import cr.ac.ucr.paraiso.ie.progra2.lab2.model.Empleado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EmpleadoDAOTest {
    private EmpleadoDAO empleadoDAO;

    @BeforeEach
    public void init() {
        try {
            empleadoDAO =
                    new EmpleadoDAO(new File("C:\\Users\\Blanca Segura\\IdeaProjects\\ControlAduanasNuevo\\src\\empleados.dat"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insercion_orden_descendente_funciona() {
        Empleado e1 = new Empleado(4, "Mercedes", "Sosa");
        Empleado e2 = new Empleado(1, "Juan", "Mora");
        Empleado e3 = new Empleado(2, "Anabel", "Rojas");

        try {
            empleadoDAO.insertarEmpleado(e1);
            empleadoDAO.insertarEmpleado(e2);
            empleadoDAO.insertarEmpleado(e3);
        } catch (EmpleadoExistenteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
