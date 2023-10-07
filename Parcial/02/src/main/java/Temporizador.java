import java.util.TimerTask;

//Autores: Cristhian David Rosales y Juan David Blanco 

public class Temporizador extends TimerTask {
    private int opcion;
    private String mensaje;
    private static int contadorAlarmas = 1;
    private long tiempoProgramado;
    
    public Temporizador(int opcion, String mensaje, Long tiempoProgramado) {
        this.opcion = opcion;
        this.mensaje = mensaje;
        this.tiempoProgramado = tiempoProgramado;
    }
    public Temporizador(int opcion, Long tiempoProgramado) {
        this.opcion = opcion;
        this.tiempoProgramado = tiempoProgramado;
    }
    
    public int getOpcion() {
        return opcion;
    }
    public String getMensaje() {
        return mensaje;
    }
    public long getTiempoProgramado() {
        return tiempoProgramado;
    }
    @Override
    public void run() {
        switch (opcion) {
            case 1:
                System.out.println("*****Mensaje programado: " + mensaje+"*****");
                break;
            case 2:
                System.out.println("*****Alarma " + contadorAlarmas+"*****");
                contadorAlarmas++;
                break;
            case 3:
                System.out.println("*****Saludo: Hola :)*****");
                break;
            case 4:
                System.out.println("*****Despedida: Chao :(*****");
                break;
        }
    }
}
