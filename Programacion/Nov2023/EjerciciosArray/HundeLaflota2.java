package Nov2023.EjerciciosArray;

import java.util.Scanner;

public class HundeLaflota2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creamos tablero ded trues y flase
        int[][] tablero = {
                // { true, false, false, false, false },
                // { false, false, true, false, true },
                // { false, true, false, false, false },
                // { true, false, false, false, false },
                // { false, false, true, true, false }
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 }
        };
        // creamos contador de barcos hundidos
        int barcosnHundidos = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Eligue una fila : ");
            int fila = sc.nextInt();
            System.out.println("Eligue el row");
            int cols = sc.nextInt();
            if (tablero[fila][cols] == 1) {
                System.out.println("Has hundido un barco");
                System.out.println("SIGUE DISPARANDO SOLDADO TE QUEDAN " + i + "\nINTENTOS VAMOS VAMOS!!!");
                barcosnHundidos++;
            }else{
                System.out.println("SOLDADO? ACASO TENGO QUE MANDARLO DE VUELTA A HACER EL SERVICIO BASISCO\nPONGA ESOS CAÑONES EN ORDEN");
                System.out.println("TE QUEDAN POCAS CHANCES" + i + "BOLAS DE CAÑON");
            }

        }
        System.out.println("-------------");
         System.out.println("FIN DE JUEGO NOVATO");
         if(barcosnHundidos<3){
System.out.println("VEO QUE ERES UN GRUMTE DE AGUA SALADA, Bajas confirmadas" + barcosnHundidos);
         }if(barcosnHundidos>3){
System.out.println("HAS HUNDIDO ES INACCEPTABLE ESTA CIFRA :" + barcosnHundidos);
         }
          
    }
}