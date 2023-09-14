
import java.util.Scanner;


public class Ent {
    static Scanner in = new Scanner(System.in);

    public static double[] ramdom(int a, double arreglo[]) {

        for (int i = 0; i < a; i++) {
            arreglo[i] = Math.random() * 100;
        }
        return arreglo;
    }

    public static int captura() {
        return in.nextInt();
    }
}
