package SlayJava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import SlayJava.Cartas.Tipo;

// usar enum en algun momento 
// ser un bucle hasta que niguno que haya muerto se hacen turnos 
//objs1 cartas
//objs2 jugadores

public class Main {

    // Main donde corre el codigo
    // Loop para correr el juego
    // Heroe/Villanos = 5 vidas Cada ronda se repite
    // Turnos aleatorios
    // Mostrar el mazo 5 cartas que no sean 5 cartas iguales
    //
    // Nueva ronda if healitself heal = 1 + hero ;
    // Aturdir que pierda el turno el contrario

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cartas> MazoJ1 = CrearMazo(sc, "Mazo J1");
        ArrayList<Cartas> MazoJ2 = CrearMazo(sc, "Mazo J2");
        // System.out.println("Mazo jugador 1 "+);
        // System.out.println("Mazo jugador 2 " + MazoJ2);
        CrearMazo(sc, "");
        batalla(sc, MazoJ1, MazoJ2);
    }

    public static ArrayList<Cartas> CrearMazo(Scanner sc, String nombreMazo) {
        ArrayList<Cartas> MazoJugador = new ArrayList<>();
        boolean CreacionDeMazo = true;

        // Para añadir una clase al array la llamamos con el nombre de la clase
        // carta0
        Cartas cartas0 = new Cartas("Nombre : Pocion menor", Tipo.Curacion, 2);
        // Carta1
        Cartas cartas1 = new Cartas(" Nombre :  Pocion Grande", Tipo.Curacion, 10);
        // Carta2
        Cartas cartas2 = new Cartas("Nombre :  Espada normal", Tipo.Ataque, 3);
        // Carta3
        Cartas cartas3 = new Cartas("Nombre :  Tajo doble", Tipo.Ataque, 5);
        // Carta4
        Cartas cartas4 = new Cartas("Nombre :  Relampalagalo", Tipo.Stun, 5);

        MazoJugador.add(cartas0);
        MazoJugador.add(cartas1);
        MazoJugador.add(cartas2);
        MazoJugador.add(cartas3);
        MazoJugador.add(cartas4);

        System.out.println("----------------------------");
        System.out.println("Bienvenido a SlayTheJava");
        System.out.println("----------------------------");
        System.out.println("Ahora elegirá cartas para " + nombreMazo);

        // Use a do-while loop to ensure that the user selects four cards
        for (int i = 0; i < 4; i++) {
            System.out.println("Elija una carta pulsando 1, 2, 3, 4 : ");
            for (int j = 0; j < MazoJugador.size(); j++) {
                Cartas cartas = MazoJugador.get(j);
                System.out.println((j + 1) + "." + cartas);
                System.out.println("---------");
            }
            int seleccion = sc.nextInt();
            Cartas cartaSeleccionada = MazoJugador.get(seleccion - 1);

            // Remove the selected card from the available cards
            MazoJugador.remove(cartaSeleccionada);

            // Add the selected card to the player's deck
            MazoJugador.add(cartaSeleccionada);
        }

        System.out.println(nombreMazo + " creado");
        return MazoJugador;
    }

    // batalla
    public static void batalla(Scanner sc, ArrayList<Cartas> MazoJ1, ArrayList<Cartas> MazoJ2) {
        Jugador jugador1 = new Jugador(1, "Jugador1", MazoJ1, 3); // 3 es el número de cartas aleatorias
        Jugador jugador2 = new Jugador(1, "Jugador2", MazoJ2, 3);

        // vidas jugadores
        jugador1.setVida(10);
        jugador2.setVida(10);

        // ronda de combate
        while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
            // Resetear el estado de las cartas antes de cada turno
            jugador1.resetearCartas();
            jugador2.resetearCartas();
            // if 1

            if (jugador1.isAturdido()) {
                System.out.println("Has sido estunuado salta turno pardillo, a ver  si espabilamos ");
                
            } else {
                System.out.println("Empieza el combate\nMazo de jugador 1: ");
                mostrarCartas(jugador1);

                System.out.println("\nElige una carta pulsando 1, 2, 3: ");
                int eleccion1 = sc.nextInt();

                // Marcar la carta como jugada
                jugador1.getMazo().get(eleccion1 - 1).setYaJugada(true);
                Cartas cartaJ1 = jugador1.getMazo().get(eleccion1 - 1);
                jugador1.usarCarta(cartaJ1, jugador2);
            }

            // if 2
            if (jugador2.isAturdido()) {
                System.out.println("Has sido estunuado te salta turno ");

            } else {

                System.out.println("\nMazo de jugador 2: ");
                mostrarCartas(jugador2);
                System.out.println("\nElige una carta pulsando 1, 2, 3: ");
                int eleccion2 = sc.nextInt();

                // Marcar la carta como jugada
                jugador2.getMazo().get(eleccion2 - 1).setYaJugada(true);
                Cartas cartaJ2 = jugador2.getMazo().get(eleccion2 - 1);

                jugador2.usarCarta(cartaJ2, jugador1);
            }
            // Imprimir la vida después de cada ronda
            System.out.println("\nVida Jugador 1: " + jugador1.getVida());
            System.out.println("Vida Jugador 2: " + jugador2.getVida());
        }

        // Verificar el resultado al final de la batalla
        if (jugador1.getVida() <= 0 || jugador2.getVida() <= 0) {
            if (jugador1.getVida() < jugador2.getVida()) {
                System.out.println("A ganado jugador 1");
            } else if (jugador1.getVida() > jugador2.getVida()) {
                System.out.println("A ganado jugador 2");
            } else {
                System.out.println("A sido empate");
            }
        }
    }

    private static void mostrarCartas(Jugador jugador) {
        for (int i = 0; i < jugador.getMazo().size(); i++) {
            Cartas carta = jugador.getMazo().get(i);
            System.out.println((i + 1) + ". " + carta);
        }
    }

    // test unitarios
    // su cobertura es como un porcentaje cuanto de completa esta testeada
    // cuestan esfuerzo y son importantes porque
    // son importantes pero las empresas no le hacen caso
    // jUny
    // desde los metodos se añaden para ver si los metodos funcionan
    // mirar equilibrios en los constructores
    // asset es una pregunta assertEquals();
    // puedes tener muchos asserts
}