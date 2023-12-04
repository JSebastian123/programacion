package EjerciciosClase20;

import java.util.Scanner;
// ejercicios clase dia 20/11
// crear un juego con 5 rondas para :
// Misma palabra o diferente palabra
// Mostraremos la longiutd de la palabra con barranajas
// toCharArray(); para convertirlo en array de chars para contar cada letra
// con un .length
// ir sumando las palabras que adivine la palabra entera tipo un ahoracado
// se puede generar palabras randoms?¿
// tambien podriamos hacer que el usuario meta palabras y ver si alguna parte de
// su plabar acoincide con la palabra
// nuestra

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraAdivinar = "papa";
        int longitudPalabra = palabraAdivinar.length();
        String Barrabajas = "_ ";
        int rondas = 4;

        System.out.println("Vamos a jugar un juego, tienes que adivinar mi palabra");

        while (rondas >= 0) {
            System.out.println("Palabra actual: " + palabraAdivinar);
            String respuesta = sc.nextLine();
            if (palabraAdivinar.equals(respuesta)) {
                System.out.println("Muy bien, has adivinado y has terminado la partida.");
                break;
            } 
            //no me llega nunca a este for 
            else {
                for (int i = longitudPalabra; i < longitudPalabra; i++) {
                    System.out.print("_");
                }
                rondas--;
                if (rondas == 0) {
                    System.out.println("Agotaste tus intentos. La palabra era: " + palabraAdivinar);
                }
            }
        }
    }

}
