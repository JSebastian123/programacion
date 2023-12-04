package Dia2111;

public class main {
    public static void main(String[] args) {
        // Ejer1
        factura factura = new factura();
        System.out.println("La factura es " + factura.Imprimir());

        // ejer2
        circulo cercle = new circulo(3.150168, 789.12, 145.25, 3.14, 0);
        System.out.println("Asi se llama a un constructor " +(cercle.getArea() * cercle.getArea()) / cercle.getCirculo());
        // no tengo ni idea de matematiccasss RUAAAHAHAHAHHA

        // ejer3
        empleado empleado = new empleado(1, 0.0, "Juan Sebastian", "Perniola", 200.0);
        empleado.setIncrementoDeSalario(12.0);
        System.out.println("Nombre de empleado : " + empleado.getFirstName() + "\nApellido empleado : "
                + empleado.getLastname() + "\nSalario empleado : " + empleado.getSalary() + "\nID :" + empleado.getId()
                + "\nY su sueldo incrementado es : " +
                (empleado.getSalary() * empleado.getIncrementoDeSalario()));

        // Ejer4

        bombilla bombilla = new bombilla(false, 100, "verde", 55.5);
        System.out.println(bombilla.EstaEncedida() + "\n" + bombilla.getColor() + "\n" + bombilla.getHoras() + "\n"
                + bombilla.getPotencia() + "\n" + bombilla.getHoras());
    }
}
