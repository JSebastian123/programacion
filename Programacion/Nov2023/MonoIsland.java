    package Nov2023;

    import java.util.Scanner;
    import java.util.Random;
/*
 * Copyright (c)
 * @author Juan Sebastian Perinola 
 * FP DAM 
 */
    public class MonoIsland {
        // me faltaria meter trys y catch pero me da pereza hay dos excpetions que
        // podriamos usar y son :
        // InputMismatchException e para los strgins no arraays
        // ArrayIndexOutOfBoundsException e y para los arraya no para los strign
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Frases jugador
            String[] frasesJugador = {
                    "¿Por qué? ¿Acaso querías pedir uno prestado?",
                    "Sí que las hay, sólo que nunca las has aprendido.",
                    "Me alegra que asistieras a tu reunión familiar diaria.",
                    "Primero deberías dejar de usarla como un plumero."
            };
            //he creado las mismas para los dos para evitar over complicar el code 
            //hola lluc mira un gato : 
            // _._     _,-'""`-._
            // (,-.`._,'(       |\`-/|
            //     `-.-' \ )-`( , o o)
            //           `-    \`_`"'-
            // meow meow meow meow meow meow meow meow meow meow meow meow
            String[] frasesJugadorSiEsPrimero = {
                    "¿Has dejado ya de usar pañales?",
                    "¡No hay palabras para describir lo asqueroso que eres!",
                    "¡He hablado con simios más educados que tú!",
                    "¡Llevarás mi espada como si fueras un pincho moruno!"
            };
            // Frases Ordenador
            String[] frasesOrdenador = {
                    "¿Has dejado ya de usar pañales?",
                    "¡No hay palabras para describir lo asqueroso que eres!",
                    "¡He hablado con simios más educados que tú!",
                    "¡Llevarás mi espada como si fueras un pincho moruno!"
            };
            String[] frasesOrdenadorSiVaSegundo = {
                    "¿Por qué? ¿Acaso querías pedir uno prestado?",
                    "Sí que las hay, sólo que nunca las has aprendido.",
                    "Me alegra que asistieras a tu reunión familiar diaria.",
                    "Primero deberías dejar de usarla como un plumero."
            };
            // Inicializamos variables, y tenemos la variable booleana para saber quién
            // arranca, la booleana está con un random que me encontré en internet :D
            int asaltosGanadosJugador = 0;
            int asaltosGanadosOrdenador = 0;

            // Generar un número aleatorio (0 o 1) para determinar quién comienza primero
            int randomInt = random.nextInt(2);
            //quite el boleano por que si,  viene a ser  lo mismo 
            //boleano randomBolas = random.nextBoolean();
            // y abajo pondriamos si es true false empiece uno u otro
            boolean jugadorEmpiezaPrimero = randomInt == 0;

            // Mostrar quién comienza primero
            if (jugadorEmpiezaPrimero) {
                System.out.println("¡Comienzas primero, Jugador!");
            } else {
                System.out.println("¡El ordenador comienza primero!");
            }

            //es un controlador de rondas basicamente
            while (asaltosGanadosJugador < 3 && asaltosGanadosOrdenador < 3) {
                // Implementar lógica del asalto, es decir tenemos frasesJugador y
                // fraseContrarrestante,

                if (jugadorEmpiezaPrimero) {
                    //aqui implemente que se muestre tus opciones
                    frasesJugador = frasesJugadorSiEsPrimero;
                    frasesOrdenador = frasesOrdenadorSiVaSegundo;
                } else {
                    // Utilizar las variables ya declaradas
                    //aqui implemente que se muestre OpcComputer
                    int indiceFraseOrdenador = random.nextInt(frasesOrdenadorSiVaSegundo.length);
                    String fraseContrarrestante = frasesOrdenadorSiVaSegundo[indiceFraseOrdenador];
                    System.out.println("El ordenador elige la siguiente frase: \"" + fraseContrarrestante + "\"");
                    frasesJugador = frasesOrdenadorSiVaSegundo;
                    frasesOrdenador = frasesJugadorSiEsPrimero;
                }
                //esta linea magica que me la saque por internte nos rota quien empiea primero y quien segundo
                jugadorEmpiezaPrimero = !jugadorEmpiezaPrimero;
                //por que nos cambia nuestro valor es decir si vamos primeros no rota nuestro valor a 2 y nos hace ir segundo
                //y viceversa 

                //mira otro gato meoww meowwwww
                //                 _...---.._
                //                 _.'`       -_  `.
                //             .-'`                  \
                //          .-`                     q
                //       _-`                       __  \
                //   .-'`                  . ' .   \ `;/
                // _.-`                    /       `._`/
                // _...--'`                        \_
                // .'`                         -         `'--.._
                // . `                           \                  `-.
                // .                `              `-..__. ... - -.._`-
                // '.                `  '''---- -''`                  `-.`.
                // .` -                '`.  `-.
                // .-` .` '             .`'.__ ;
                // _.-` .-`   '            .
                // _.-`  .-`       '         .`
                // (`''-'' _.-`          '        .'
                // `'---''            .`       .`
                // .'     . '`
                // .    .-`
                // .`   ,`
                // '   .'
                // '   .`
                // '  .`
                // `  '.    -Y. Huang- siempre creditos al creador
                // `.___;
                // Mostrar las opciones del Jugador
                System.out.println("Opciones del Jugador:");
                mostrarOpciones(frasesJugador);
                System.out.println();

                // Permitir al jugador elegir una frase
                String fraseJugador = elegirFrase(scanner, frasesJugador, "Jugador");
                // Elegir una frase al azar para el ordenador
                String fraseContrarrestante = frasesOrdenador[random.nextInt(frasesOrdenador.length)];

                // Mostrar las frases de ti y computadora re sacada y loca 
                System.out.println("Jugador: " + fraseJugador);
                System.out.println("Ordenador: " + fraseContrarrestante);

                // Simplemetne si son iguales una cosa y no lo son otra 
                if (fraseJugador.equals(fraseContrarrestante)) {
                    System.out.println("================================================================");
                    System.out.println("Empate en el asalto.");
                    System.out.println("================================================================");

                } else {
                    asaltosGanadosJugador++;
                    System.out.println("================================================================");
                    System.out.println("¡Has ganado el asalto!");
                    System.out.println("================================================================");
                }

                // Visualizar marcador con información sobre quién comienza primero en el asalto
                // actual
                String quienComienza = "";
                if (jugadorEmpiezaPrimero) {
                    quienComienza = "Jugador";
                } else {
                    quienComienza = "Ordenador";
                }

                System.out.println("================================================================");
                System.out.println("Marcador: Jugador " + asaltosGanadosJugador + " - " + asaltosGanadosOrdenador +
                        " Ordenador (Comienza primero: " + quienComienza + ")");
                System.out.println("================================================================");
                // uso ests Sout vacios para hacer saltos de linea y quede un poco mas limpio el codigo nose
                //si es buena practica
                System.out.println();
            }

            // Visualizar ganador de la batalla de gallos
            if (asaltosGanadosJugador >= 3) {
                System.out.println("================================================================");
                System.out.println("¡Has ganado el duelo!");
                System.out.println("================================================================");
            } else {
                System.out.println("================================================================");
                System.out.println("El ordenador ha ganado el duelo.");
                System.out.println("================================================================");
            }

            scanner.close();
        }

        // Método para mostrar las opciones
        public static void mostrarOpciones(String[] frases) {
            for (int i = 0; i < frases.length; i++) {
                System.out.println((i + 1) + ". " + frases[i]);
            }
        }

        // Método para que el jugador elija una frase
        public static String elegirFrase(Scanner scanner, String[] frases, String jugador) {
            System.out.println("Elige una frase para " + jugador + " : ");
            int eleccion = scanner.nextInt();
            // Restamos 1 para que en vez de que el usuario ponga 0, 1, 2 ..., sea 1, 2, 3,
            // ...
            return frases[eleccion - 1];
        }
    }
