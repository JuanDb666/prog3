
import java.util.Scanner;


public class Entrada {
    private static Scanner imput= new Scanner (System.in);
    
    public static int readInt(String mss) {
        System.out.println(mss);
        return imput.nextInt();
    }
    public static String readText(String mss) {
        System.out.println(mss);
        return imput.nextLine();
    }
    public static void correcion() {
        imput.nextLine();
    }
}

