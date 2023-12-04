public class ArrayVacios {
    public static void main(String[] args) {
        // variable nueva viendo que quermeos meter dentro
        // le decimos que tamaño tendra el array
        // misma estructura de arrays

        // int[] arrayan = new int[10];
        // creemos una variable que sera el inicio del contador = 0
        int cantidadDeEspacios = 0;
        // creamos el string que necesitamos
        String frase = "patata patatina ";
        // pasamos el string a que sea un char
        char[] a = frase.toCharArray();
        // creamo un loop para que cuente el length del Sting dedse un array de chars
        // q crea un '' a cada espacio ocupado

        for (int i = 0; i < a.length; i++) {
            // creamo un if el cual coge el indice de cada char[]
            if (frase.charAt(i) == ' ') {
                // incrementamos el canidad esapcios para que incremente
                cantidadDeEspacios++;
            }
        }
        // sacamos el total 
        System.out.println(cantidadDeEspacios);
    }
}
