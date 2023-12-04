public class array {
    // como usar arrays in java
    public static void main(String args[]) {
        // String[] cars = { "Cochazo", "Cochazo2", "Cochazo3" };
        // aqui lo que pasa es que iniciamos una variable para el for en la cual
        // es i esta incrementara hasta que sea i mayor al array
        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[i]);
        // }
        // // ej de print : Cochazo
        // // Cochazo2
        // // Cochazo3
        // // aqui en este caso indicamos que solo nos
        // // nos saque por teclado la posicion 0 del array
        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[0]);
        // // ej de print
        // // Cochazo
        // // Cochazo
        // // Cochazo
        // }

        // For each,
        // String[] cars ={"Coche 1", "Coche 2", "Coche 3"};
        // for(String i : cars){
        // System.out.println(i);
        // }

        // arrays multidimensionales :

        int[][] a = { { 1, 2, 3, 4,82,19,198 },{ 1, 2, 4, 5,8,9,82,19,198 }, };

        for (int i = 0; i < a.length; i++) 
            for (int j = 0; j < a   [i].length; j++) 
                System.out.println(a[i][j]);
            
        
    }
}