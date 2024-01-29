package SlayJava;

import java.util.ArrayList;
import java.util.Random;

import SlayJava.Cartas.Tipo;

public class Jugador {
    private int vida;
    private String Nombre;
    private ArrayList<Cartas> Mazo;
    private boolean aturdido = false;

    // public Jugador(int vida, String Nombre, ArrayList<Cartas> Mazo) {
    // this.setVida(vida);
    // this.setMazo(Mazo);
    // this.setNombre(Nombre);
    // }
    public Jugador(int vida, String nombre, ArrayList<Cartas> mazo, int numCartas) {
        this.setVida(vida);
        this.setNombre(nombre);
        this.setMazo(new ArrayList<>()); // Inicializa el mazo como una nueva ArrayList

        // Selecciona cartas aleatorias del mazo original
        Random random = new Random();
        for (int i = 0; i < numCartas && i < mazo.size(); i++) {
            int indiceCartaAleatoria = random.nextInt(mazo.size());
            Cartas cartaAleatoria = mazo.get(indiceCartaAleatoria);
            this.getMazo().add(cartaAleatoria);
        }
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Cartas> getMazo() {
        return Mazo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        Mazo = mazo;
    }

    public void perderVida(int valor) {
        this.vida -= valor; // Resta 1 a la vida del jugador
    }

    public void sumarVida(int curacion) {
        this.vida += curacion; // Resta 1 a la vida del jugador
    }
    
    public boolean isAturdido() {
        return aturdido;
    }

    public void setAturdido(boolean aturdido) {
        this.aturdido = aturdido;
    }
    // for de pintar cartas lluc lo dijo
    // Constructor para seleccionar cartas aleatorias del mazo
    public void resetearCartas() {
        for (Cartas carta : this.getMazo()) {
            carta.setYaJugada(false);
        }
    }

    public void usarCarta(Cartas cartaActual, Jugador oponente) {
        if (cartaActual.getTipoDeCartas() == Tipo.Curacion) {
            // Cura a este personaje cartaActual.getValor()
           // this.vida = +cartaActual.getValorCarta();
            sumarVida(cartaActual.getValorCarta());
        } else if (cartaActual.getTipoDeCartas() == Tipo.Ataque) {
            // Atacas al jugador enemigo
            oponente.perderVida(cartaActual.getValorCarta());
        } else if (cartaActual.getTipoDeCartas() == Tipo.Stun) {
            // Atacas al jugador enemigo y lo stuneas
            oponente.setAturdido(true);    
            oponente.perderVida(cartaActual.getValorCarta());    
        } 
}
}
