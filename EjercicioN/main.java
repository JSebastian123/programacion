package EjercicioN;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class main { // Class names should start with an uppercase letter
    public static List<pareja> parejaTorneo = new ArrayList<>();
    // public static List<Partido> partidosToreo;
    // public static Integer<Partido> partidosTorneo;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("Nuevo torneo de Padel");
        System.out.println("----------------------------------");
        System.out.println("Que quieres hacer? ");

        System.out.println("0-Cerrar app");
        System.out.println("1-Crear equipo ");
        System.out.println("2-Eliminar equipo ");
        System.out.println("3-Pintar equipo ");
        System.out.println("4-Generar rondas ");
        System.out.println("----------------------------------");

        int funcion = sc.nextInt();

        while (funcion != 0) {
            switch (funcion) {
                case 1:
                    crearParejas(sc);
                    break;
                case 2:
                    eliminarPareja(sc);
                    break;
                case 3:
                    pintarParejas();
                    break;
            }
            // Add this line to prevent an infinite loop
            System.out.println("\nQue quieres hacer? Recuerda las opciones  : \n1-Crear equipo" + //
                    "\n2-Eliminar equipo" +
                    "\n3-Pintar equipo ");
            funcion = sc.nextInt();
        }
    }

    private static void crearParejas(Scanner sc) {
        boolean fin = false;
        sc.nextLine();

        while (!fin) {
            // int i = Integer.valueOf(sc.nextLine());
            Integer id = parejaTorneo.size() + 1;
            System.out.println("Nombre jugador 1 ");
            String nombre1 = sc.nextLine();
            System.out.println("Nombre jugador 2 ");
            String nombre2 = sc.nextLine();
            System.out.println("Dame el numero ");
            int telefono = sc.nextInt();
            sc.nextLine();

            pareja pareja = new pareja(id, nombre1, nombre2, telefono);
            parejaTorneo.add(pareja);

            System.out.println("Quieres crear otra pareja? (Sí/No)");
            String respuesta = sc.nextLine().toLowerCase();
            fin = !respuesta.equals("si");
        }
    }

    private static void eliminarPareja(Scanner sc) {
        if (parejaTorneo.isEmpty()) {
            System.out.println("No hay las listas estan vacias");
        } else {
            System.out.println("El id del equipo a eliminar ");
            Integer id = sc.nextInt();

            Optional<pareja> parejaEliminar = parejaTorneo.stream().filter(pareja -> id.equals(pareja.getId()))
                    .findFirst();

            parejaEliminar.ifPresent(p -> parejaTorneo.remove(p));
        }

    }

    private static void pintarParejas() {
        for (pareja pareja : parejaTorneo) {
            pareja.pintarInformacion();
        }
        if (parejaTorneo.isEmpty()) {
            System.out.println("Info : no hay niguna pareaja ");

        }

    }
    private static void generarRonda(){
        //Por cada dos pareajs, crear un partido 
        // Necesitaremos una lista fe partidos
        // Añadimos cada partido a la lista de partidos del torneo
        // Partido partido = new Partido();

        // listaPartidos.add();
    }
    
    // public class  (){

    // }
}
