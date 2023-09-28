
import java.util.LinkedList;


public class Salida {
    public static void exit(String a) { 
        System.out.println(a);
    }
    public static void exit_Asignatura( LinkedList<Asignatura> m) {

for (int i=0;i<m.size(); i++) {
    Asignatura temporal= m.get(i); 
    System.out.println("Asignarura: "+temporal.getNombre()); 
    System.out.println("Codigo" +temporal.getCodigo() ); 
    System.out.println("Semestre: " + temporal.getSemestre ()); 
    System.out.println("Creditos" + temporal.getN_creditos()); 
    System.out.println("Horario de clase: " + temporal.getHorario ());
}
}
}


