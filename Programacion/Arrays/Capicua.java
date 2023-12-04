
public class Capicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra = "papitas";
        char[] capicua = palabra.toCharArray();
        int izq, der;
        izq = 0;
        der = capicua.length - 1;

        while (izq < der) {
            if (capicua[izq] == capicua[der]) {
                der--;
                izq++;
            } else {
                System.out.println(palabra + "La palabra no es un capicua");
                break;
            }
        }

        if (izq == der) {
            System.out.println("La palabra es un capicua");
        }
    }

}