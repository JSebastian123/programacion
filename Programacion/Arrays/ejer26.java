import java.util.Scanner;

public class ejer26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // creamos las variables iniciandolas en 0 para mas tarde sumarlas con un for
        int[] i = new int[10];
        int num_positvos = 0;
        int num_negativos = 0;

        for (int a = 0; a <= 10; a++) {
            System.out.println("Dame un numero :");
            i[a] = sc.nextInt();
            if (i[a] < 0) {
                num_negativos++;
            }
            if (i[a] > 0) {
                num_positvos++;
            }
        }
        System.out.println("Total numeros positivos : " + num_positvos++);
        System.out.println("Total numeros positivos : " + num_negativos++);
        sc.close();
    }

}
