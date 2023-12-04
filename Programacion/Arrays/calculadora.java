import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadora {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println(
                    "Bienvenido soy una calculadora a continuacion\nte dare opciones para que eligas que \noperacion aritmetica querrashacer");
            System.out.println("Pulse 1 para suma ");
            System.out.println("Pulse 2 para resta ");
            System.out.println("Pulse 3 para multiplacion ");
            System.out.println("Pulse 4 para division ");
            System.out.println("Para termianar 5 ");

            System.out.print("Eligue que opcion segiras a continuacion ");
            int opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Opcion  1 : suma ");
                        suma();
                        break;
                    case 2:
                        System.out.println("Opcion  1 : resta ");
                        resta();
                        break;
                    case 3:
                        System.out.println("Opcion  1 : suma ");
                        multiplicacion();
                        break;
                    case 4:
                        System.out.println("Opcion  1 : suma ");
                        division();
                        break;
                    case 5:
                        salir = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Dame un valor entre 1 y 4 ");
                sc.nextInt();
            }

        }
       
    }

    public static void suma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el 1 valor : ");
        int a = sc.nextInt();
        System.out.println("Dame el 2 valor : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("El resultado de tu suma es : " + sum);
        
    }

    public static void resta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el 1 valor : ");
        int a = sc.nextInt();
        System.out.println("Dame el 2 valor : ");
        int b = sc.nextInt();
        int sum = a - b;
        System.out.println("El resultado de tu suma es : " + sum);
       
    }

    public static void multiplicacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el 1 valor : ");
        int a = sc.nextInt();
        System.out.println("Dame el 2 valor : ");
        int b = sc.nextInt();
        int sum = a * b;
        System.out.println("El resultado de tu suma es : " + sum);
        sc.close();
    }

    public static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el 1 valor : ");
        int a = sc.nextInt();
        System.out.println("Dame el 2 valor : ");
        int b = sc.nextInt();
        int sum = a / b;
        System.out.println("El resultado de tu suma es : " + sum);
       
    }
// pregintar por que si cierro los scanners ¿?
// 26/27
}
