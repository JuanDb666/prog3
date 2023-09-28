
import java.util.LinkedList;


public class Registro {
    Estudiante estudiante;
    Asignatura asign;
    LinkedList<String> listAsignatura;
    
    Registro (Estudiante estudiante) {
        this.estudiante=estudiante;
        listAsignatura= new LinkedList<>();
    }
}
