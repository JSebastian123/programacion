package SlayJava;

import java.util.ArrayList;

public class Jugador {
    private int vida;
    private String  Nombre;
    private ArrayList<String> Mazo;
    void Jugador(int vida,String  Nombre,ArrayList<String> Mazo){
        this.setVida(vida);
        this.setMazo(Mazo);
        this.setNombre(Nombre);
        }
    public int getVida() {
        return vida;
    }
    public String getNombre() {
        return Nombre;
    }
    public ArrayList<String> getMazo() {
        return Mazo;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setMazo(ArrayList<String> mazo) {
        Mazo = mazo;
    }
        
}
