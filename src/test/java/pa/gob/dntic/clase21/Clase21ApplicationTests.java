// Prueba de commit
package pa.gob.dntic.clase21;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pa.gob.dntic.tareas.TareasApplication;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = TareasApplication.class)
class Clase21ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void deberiaDevolverTresTareas() {
        TareasApplication app = new TareasApplication();
        List<String> tareas = app.tareas();
        assertEquals(3, tareas.size());
    }
}
