package cuatrodeldoce;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class actividad1 {
    // pintar la hora de hoy en java, como crear un formato de fecha que por consola
    // y que el lo coja
    // por consola o una variabla
    public class CurrentDateTime {
        // main method
        public static void main(String[] argvs) {
            // System.out.println(java.time.LocalTime.now());
            LocalDate today = LocalDate.now();
            System.out.println("Current Date = " + today);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            String dateTrans = today.format(formatter);
            System.out.println("Current Date = " + dateTrans);
        }
    }
}
