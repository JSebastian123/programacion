package Nov2023;

import java.lang.reflect.Array;
import java.util.Arrays;

public class clasesYarrays {
    public static void main(String args[]) {
        // // Ejer1
        // int[][] a = {{1,2,3,4},{12,3,2,1},{1,2,3,4,5}};
        // int resultado;
        // int valoresSuma = 0;
        // int i;
        // for ( i=0 ; i < a.length; i++) {
        // // el elevado
        // // resultado = a[i]*a[i];
        // resultado = +a[i][i] * 2;
        // // c
        // valoresSuma = valoresSuma + resultado;

        // }
        // System.out.println("Resultado de tu array eleveado : " + Arrays.toString(a));
        // System.out.println("Resultado de tu array eleveado : " + valoresSuma);

        // int[] a = { 1, 2, 3, 6, 4, 8 };
        // int resultado;

        // for (int i = 0; i < a.length; i++) {
        // resultado = a[i] * a[i];
        // if (a[i] % 2 == 0) {
        // System.out.println("Resultado de tu array eleveado : " + resultado);
        // }
        // }

        // Ejer3 matriz triple
        // se deberia crear 5 arrays?¿

        int[][] matriz = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int resultado = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (i * matriz.length) + (j + 1);
                System.out.print(matriz[i][j] + " ");
                resultado = matriz[i][j] + resultado;

            }

            System.out.println();
        }
        System.out.println(resultado);
        //
    }
}
