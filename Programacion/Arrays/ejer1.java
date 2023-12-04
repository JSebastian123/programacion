import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = input.nextDouble();

        // Calcula la longitud de la circunferencia
        double longitud = 2 * Math.PI * radio;

        // Calcula el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
        input.close();
    }
}
