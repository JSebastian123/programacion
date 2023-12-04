import java.util.Scanner;

public class charMayusOrMinus {
    public static void main(String args[]) {
        // variables, scanner iniciados 
        Scanner sc = new Scanner(System.in);
        int count = 0; int countMayus = 0;
        System.out.println("Puedes escribir un texot o palabra ?¿");
        String InputPhrase = sc.nextLine();

        // Usamos esta linea para separar el string en difs palabras cortandolas con ""
        String[] arrayCreado = InputPhrase.trim().split("");
        // por algun motivo empieza a contar desde 1 hasta la ultima letra
        System.out.println("La longitud  del string es " + arrayCreado.length);
        sc.close();

        // ahora creamos dos fors uno para que no se para que es cada uno XD

        for (int i = 0; i < arrayCreado.length; i++) {
            char[] cadaPalabraEnArray = arrayCreado[i].toCharArray();
        
            for (int j = 0; j < cadaPalabraEnArray.length; j++) { // <-- Use cadaPalabraEnArray.length
                if (Character.isLowerCase(cadaPalabraEnArray[j])) {
                    count++;
                }
             
            }
            for(int b = 0; b <cadaPalabraEnArray.length; b++ ){
                if(Character.isUpperCase(cadaPalabraEnArray[b])){
                    countMayus++;
                }
            }
             
             
            }
            System.out.println("Mayusculas totales : " + countMayus);
            System.out.println("Minusculas totales : " + count);
        }

}
