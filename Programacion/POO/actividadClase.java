package POO;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JuanPrograma
 */
public class actividadClase {
    // simular un juego de acertar un numero de 0-50.
    // num alertorio
    // turnos pide numero a jugador

    // decir si esta cerca o lejos el numero genrado del input :

    // acaba cuando el numero == al N

    // != == <= >=
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int NumeroRandom = random.nextInt(0, 51);
        int rondas = 5;
        int N = 0;
        while (rondas > 0) {
            System.out.println("Dame un numero pls : ");
            N = sc.nextInt();
            if (N == NumeroRandom) {
                break;
            }
            if (N < NumeroRandom) {
                System.out.println("Has metido un numero menor al numero random");
                rondas--;
            }
            if (N > NumeroRandom) {
                System.out.println("Has metido un numero mayor al aleatorio");
                rondas--;
            }

        }
        if (N == NumeroRandom) {
            System.out.println("Muy bien has acertado y has termiando la partida");

        }
        if (N != NumeroRandom) {
            System.out.println("No has acertado y se ha terminado la partida cara calabaza " + NumeroRandom
                    + "<________________________________ este era el num random");
        }
    }

}
