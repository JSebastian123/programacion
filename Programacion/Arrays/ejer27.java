import java.util.Scanner;

public class ejer27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        long factorial = 1;
        System.out.println("Dame un numero para calcular su factorial : ");
        i = sc.nextInt();

        for (int a = 2; a <= i; a++) {
            factorial *= i;
            System.out.println("Este es el factorial de " + i + " y su factorial es " + factorial);
        }

    }
}
