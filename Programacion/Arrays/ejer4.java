import java.util.Scanner;

class ejer4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);    
      try{
        System.out.println("Dame tu palabra y vere si tiene mayusculas ");
        
        char ch = sc.next().charAt(0);
        boolean b = Character.isUpperCase(ch);
        System.out.println(ch + "Es upper case la palabra??? " + b);
        sc.close();
      } 
      catch(Exception e ){
        System.out.println("Entrada invalida ");
      }
  }
}