
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab0301 {

   static LinkedList<Asignatura> materia = new LinkedList<>();
   static Queue<Registro> regis = new LinkedList<>();

public static void main(String[] args) {
    //registro estudiante();
    lec_archivo();
    Salida.exit(at "Ingrese Las Materias A Inscribir");
    registro asignaturas();
    //reporte_registo_final ();
    Salida.exit Asignatura (: materias);
}
public static void registro_estudiante() {
  String codigo = Entrada. readText ("Ingreese el Cogigo Del Estudiante");
  String nombre = Entrada. readText ("Ingrese El Nombre Del estudiante");
  String correo = Entrada. readText ("Ingrese El Correo Del Estudiante");
  int semestre = Entrada.readInt ("Ingrese El Semestre"); 
  Estudiante estud = new Estudiante (codigo, nombre, correo, semestre);
  regis.add(new Registro(estud));
}
public static void registro_asignaturas(){
    int credit = 0, creditemporal=0;
    String pregunta;
    while (credit < 5) {
    int codigo = Entrada.readInt("Ingrese el Codigo de la asignatura ");Entrada.correcion();
    String nom_asignatura = Entrada. readText ( "Ingrese Nombre Asignaruta");
    int semestre = Entrada.readInt ( "Ingrese el Semestre al que pertenece");
    int n_credi = Entrada.readInt ("Ingrese el numero de creditos");Entrada.correcion();
    String hora = Entrada. readText ("Ingrese el horario ");
    materia.add(new Asignatura (codigo, nom_asignatura, semestre, n_credi, hora));
    credit += n_credi;
    if (credit >= 5) {
       pregunta = Entrada.readText ("usted ya incribio el minimo de 5 creditos, ¿Continuar?");
        if (pregunta.equalsIgnoreCase ("si")) {
            while (credit < 16) {
                creditemporal=credit;
                int codigo = Entrada.readInt ("Ingrese el Codigo de la asignatura ");Entrada.correcion();
                String nom_asignatura = Entrada. readText ("Ingrese Nombre Asignaruta"); 
                int semestre = Entrada.readInt ( "Ingrese el Semestre al que pertenece");
                int n_credi = Entrada.readInt("Ingrese numero de creditos");Entrada.correcion(); 
                credit += n_credi;
                String hora = Entrada. readText ("Ingrese el horario ");
                for (Asignatura temp: materia){
                    if(!hora.equalsIgnoreCase(temp.getHorario())){
                        materia.add(new Asignatura(codigo, nom_asignatura, semestre, n_credi, hora));
                        break;
                    }if (hora.equalsIgnoreCase(temp.getHorario())){
                        System.out.println("Horario ya inscrito previamente");
                        credit=creditemporal;
                    }
                }
        }
                
                }else {
            
        }
    
    }
    
    }
   
}
 public static void reporte_registro_final(){
        
    }
 public static void lec_archivo(){
     FileReader archi;
     BufferedReader lector;
     String mensaje = "", lec;
     try {
          archi = new FileReader();
     }         
 }
}
