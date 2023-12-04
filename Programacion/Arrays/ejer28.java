import java.util.Scanner;

public class ejer28 {
    // crear un array para contar la cantidad cuantas o´s tiene un texto
    public static void main(String[] args) {
        
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user's input
        System.out.println("Enter strings (use a space to separate them; hit enter to finish) : ");

        String str = input.nextLine();

        // use split to divide the string into different words cutting by " "
        String[] palabrasArray = str.trim().split(" ");

        System.out.println("The length of string is " + palabrasArray.length);

        for (int i = 0; i < palabrasArray.length; i++) {
            char[] letraDeArray = palabrasArray[i].toCharArray();
            int count = 0;
            for (int j = 0; j < letraDeArray.length; j++) {
                if (Character.isLetter(letraDeArray[j])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
