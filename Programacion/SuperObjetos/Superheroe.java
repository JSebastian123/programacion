package SuperObjetos;

public class Superheroe {

    public String nombre;
    public String descripcion;
    public String[] habilidades;
    public String rareza = "Legendario"; // comun, epico, legendario
    public String tipo;
    public int fuerza; // De 0 a 10
    public int vida; // De 0 a 10

    /* COnstructor con parámetros base */
    public Superheroe(String nombre, int fuerza, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
        this.rareza = "comun";
    }

    /* Constructor vacio */
    public Superheroe() {
        this.rareza = "comun";
    }

    int CantidadLegs = 0;

    // primero deberiamos tener cuantas legendarias hay yo iniciare que hay 3
    // legendarias
    public int getLegendavilidad() {
        int i = 0;
        while (i < rareza.length()) {
            if (rareza.equals("Legendario")) {
                CantidadLegs = 0;
                CantidadLegs++;
            }
        }
        return CantidadLegs;
    }
    // Metodos de la classe superheroe:

    /**
     * Pinta el nombre del Superheroe y sus estadisticas
     */

}