import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;

//Autores: Cristhian David Rosales y Juan David Blanco 

public class Main {
    private static Timer timer = new Timer();
    private static List<Temporizador> temporizadoresActivos = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("\t\tProgramador de tareas");
            System.out.println("Seleccione una tarea a programar:");
            System.out.println("1. Programar Mensaje");
            System.out.println("2. Programar Alarma");
            System.out.println("3. Programar Saludo");
            System.out.println("4. Programar Despedida");
            System.out.println("5. Detener temporizador especifico");
            System.out.println("6. Reiniciar temporizador especifico");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            
        }
    }
}
