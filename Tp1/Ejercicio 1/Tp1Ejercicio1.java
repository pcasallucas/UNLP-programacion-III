
import java.util.Scanner;

public class Tp1Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        int b = sc.nextInt();
        metodofor(a,b);
        metodoWhile(a,b);
        metodo3(a,b);
    }

    public static void metodofor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(" " + i);
        }
    }

    public static void metodoWhile(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println(" " + i);
            i++;
        }
    }

    public static void metodo3(int a, int b) {
        if (a <= b) {
            System.out.println(" " + a);
            metodo3(a + 1, b);
        }
    }
}