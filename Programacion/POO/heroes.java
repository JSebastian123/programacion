package POO;

import SuperObjetos.Superheroe;

public class heroes {
    public String nombre;
    public String descrp;
    public String[] hablidades;
    public int estrellas; // Comun, Epico, Legendario
    public String tipo;
    public int fuerza; // de 0 a 10
    public int vida; // de 0 a 10
    public String descripcion;
    public String[] habilidades;
    public String rareza;
    public Superheroe[] heroes;
    public Superheroe[] superheroes;

    public heroes(String string, int i, int j) {
    }

    public heroes() {
    }

    // metodos utiles para los superheroes
    public void pintarInformacion() {
        System.out.println(nombre + " " + descrp);

        System.out.println("Fuerza : " + fuerza);

    }
}
