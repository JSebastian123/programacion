package SuperObjetos;

public class Coleccion {

    public Superheroe[] superheroes;
    public String propietario;
    public String fecha;

    /* Constructor vacio */
    public Coleccion() {
    }

    // Metodos de nuestra coleccion:

    /**
     * Pinta la info de todos los heroes.
     */
    public void pintarvida(){
        int i = 0;
      while(i<superheroes.length){
        if(superheroes[i].vida > vidaMaxima ){
           vidaMaxima = superheroes[i].vida;
        }
        i++
      }
    }

}
