import java.util.Scanner;
public class ejerInClass {
    public static void main(String args[]){
    Scanner A = new Scanner(System.in);
    int x;
    System.out.print("Dime que dia es hoy : ");
    x = A.nextInt();
    System.out.println("Hoy es dia  : " + x );
    A.close();

    }
}
