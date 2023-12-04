import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la longitud de un lado del triángulo equilátero: ");
        double lado = input.nextDouble();

        // Calcula el área del triángulo equilátero
        double area = (lado * lado * Math.sqrt(3)) / 4;

        System.out.println("El área del triángulo equilátero es: " + area);
        input.close();
    }
}

