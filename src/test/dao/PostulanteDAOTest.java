package dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import model.Postulante;

public class PostulanteDAOTest {

    @Test
    void insertarPostulante_correcto() {
        PostulanteDAO dao = new PostulanteDAO();
        Postulante p = new Postulante();

        p.setNombre("Test");
        p.setApellidoPaterno("JUnit");
        p.setApellidoMaterno("Demo");
        p.setDni("99998888");
        p.setCorreo("test.junit@gmail.com");
        p.setTelefonoCelular("987654321");
        p.setSexo("M");
        p.setUbigeo("150122");

        assertDoesNotThrow(() -> {
            dao.insertar(p);
        });
    }
}
