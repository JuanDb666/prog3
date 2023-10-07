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

            if (opcion == 7) {
                detenerTodosLosTemporizadores();
                break;
            }

            if (opcion == 5) {
                System.out.println("Ingrese el número de temporizador que desea detener:");
                int numeroTemporizador = scanner.nextInt();
                detenerTemporizador(numeroTemporizador);
            } else if (opcion == 6) {
                System.out.println("Ingrese el número de temporizador que desea reiniciar:");
                int numeroTemporizador = scanner.nextInt();
                reiniciarTemporizador(numeroTemporizador);
            } else {
                long tiempoEspera;
                tiempoEspera = obtenerTiempoEspera(scanner);
            
                if (opcion == 1) {
                    System.out.println("Ingrese el mensaje para el temporizador:");
                    scanner.nextLine();
                    String mensaje = scanner.nextLine();
                    Temporizador tarea = new Temporizador(opcion, mensaje, tiempoEspera);
                    int contTemporizador = temporizadoresActivos.size()+1;
                    System.out.println("Se programo el temporizador "+contTemporizador);
                    temporizadoresActivos.add(tarea);
                    timer.schedule(tarea, tiempoEspera);
                } else {
                    Temporizador tarea = new Temporizador(opcion, tiempoEspera);
                    int contTemporizador = temporizadoresActivos.size()+1;
                    System.out.println("Se programo el temporizador "+contTemporizador);
                    temporizadoresActivos.add(tarea);
                    timer.schedule(tarea, tiempoEspera);
                }
            }   
        }
    }

    private static void detenerTemporizador(int numeroTemporizador) {
        if (numeroTemporizador >= 1 && numeroTemporizador <= temporizadoresActivos.size()) {
            Temporizador tarea = temporizadoresActivos.get(numeroTemporizador - 1);
            tarea.cancel();
            temporizadoresActivos.remove(tarea);
            System.out.println("Temporizador " + numeroTemporizador + " detenido.");
        } else {
            System.out.println("Temporizador no válido.");
        }
    }

    private static void reiniciarTemporizador(int numeroTemporizador) {
        if (numeroTemporizador >= 1 && numeroTemporizador <= temporizadoresActivos.size()) {
            
            Temporizador tarea = temporizadoresActivos.get(numeroTemporizador - 1);

            int opcion = tarea.getOpcion();
            String mensaje = tarea.getMensaje();
            long tiempoProgramado = tarea.getTiempoProgramado();
            System.out.println(tiempoProgramado);

            tarea.cancel();

            timer.schedule(new Temporizador(opcion, mensaje, tiempoProgramado), tiempoProgramado);
            System.out.println("Temporizador " + numeroTemporizador + " reiniciado.");
        } else {
            System.out.println("Temporizador no válido.");
        }
    }

    private static void detenerTodosLosTemporizadores() {
        timer.cancel();
        System.out.println("Todos los temporizadores detenidos.");
    }
    
    private static long obtenerTiempoEspera(Scanner scanner) {
        System.out.println("Ingrese el tiempo de espera en segundos:");
        return (scanner.nextLong() * 1000);
    }
}