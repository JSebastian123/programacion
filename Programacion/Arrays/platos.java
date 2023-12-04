/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author JuanPrograma
 */

public class /* main<---> */ platos {
    private static void main(String args[]) {
        // ejercicio Clase
        // hay que hacer cosas del bucle
        // Enunciado : Leer por pantalla el coste de un plato
        // Hasta que no ponga valor de plato o 0
        Scanner sc = new Scanner(System.in);    
        boolean salir = false;
        Double TotalPlatos = 0.0; // Inicializa la variable TotalPlatos en 0

        int contador = 0;
        while (!salir) {
            System.out.println("Dame el valor de plato : ");
            Double ValorPlato = sc.nextDouble();

            if (ValorPlato <= 0) {
                salir = true;

            } else {
                TotalPlatos += ValorPlato;
                contador++;
            }

        }
        sc.close();
        Double promedio = TotalPlatos / contador;
        System.out.println("El valor promedio de los platos es = " + promedio);
    }

    @Override
    public String toString() {
        return "platos []";
    }

}