
// Crea un programa Java que indiqui si és un número par o impar.
import java.util.Scanner;

public class ejer3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double numConsola;
        System.out.println("Give a number and ill tell if is even or odd : ");
        numConsola = sc.nextDouble();
        sc.close();
        if (numConsola % 2 == 0) {
            System.out.println("Your number is odd ");
        } else {
            System.out.println("Your number is even ");
        }
    }
}
