package Nov2023;

import java.util.Scanner;

public class HundeLaFlota {
    /**
     * Crea una tabla/matriz de 5x5 con valores booleanos
     * Supondremos que cada booleano equivale a un barco de hundiendo la flota
     * El usuario puede escribir una posicion X y Z (usar Scanner)
     * El programa debe calcular si el usuario ha hundido el barco
     * El usuario tiene 5 intentos, en el quinto, se debe mostrar un mensaje de fin
     * de juego.
     */
    public static void main(String[] args) {

        // Descomenta el ejercicio que quieras ejecutar:
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        ejercicio4();
    }

    private static void ejercicio4() {
        Scanner escaner = new Scanner(System.in);
        boolean[][] tablero = {
                { true, false, false, false, false },
                { false, false, true, false, true },
                { false, true, false, false, false },
                { true, false, false, false, false },
                { false, false, true, true, false }
        };
        int barcosHundidos = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Disparar en la fila: ");
            int fila = escaner.nextInt();
            System.out.print("Disparar en la columna: ");
            int columna = escaner.nextInt();
            try {
        //   si quisiera imprimir el teclado deberia cambiar por 1-0
        // meter un for j y otro for k para coger cada valor 
                if (tablero[fila][columna] == true) {
                    System.out.println("Has hundido un barco!");
                    System.out.println("Sigue disparando. Quedan " + i + " intentos.");
                    barcosHundidos++;
                } else {
                    System.out.println("Has fallado! No hay ningun barco en esta posición.");
                    System.out.println("Quedan " + i + "intentos.");
                }
            } catch (Exception e) {
                System.out.println("Por favaro dame valores correctos");
            }

        }

        System.out.println("--------------");
        System.out.println("Fin del juego.");
        System.out.println("El jugador ha hundido " + barcosHundidos + " barcos.");
        escaner.close();
    }
}