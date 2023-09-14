
import java.util.LinkedList;
import java.util.Queue;


public class Lab0301 {
    
    static Queue<Registro> regis = new LinkedList<>();
    public static void main(String[] args) {
        registro_estudiante();
        registro_asignatura();
        reporte_resgistro_final();
    }

    public static void registro_estudiante() {
        String codigo = Entrada.readText("Codigo Estudiate");
        String nombre = Entrada.readText("Nombre de estudiante: ");
        String correo = Entrada.readText("Correo estudiante: ");
        int semestre = Entrada.readInt("semestre: ");
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        // crear el registro con el codigo del estudiante (por ahora)
        // luego agregamos las asignaturas
        regis.add(new Registro(estud));
    }

    public static void registro_asignatura() {
        
    }

    public static void reporte_resgistro_final() {
      
    }
    
}
