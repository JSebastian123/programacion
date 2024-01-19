package SlayJava;

public class Cartas {
    private String NombreCarta;
    private Tipo TipoDeCartas;
    private Integer ValorCarta;


    // private String TipoDeLaCarta;
    public Cartas(String NombreCarta, Tipo TipoDeCartas, Integer ValorCarta ) {
        this.NombreCarta = NombreCarta;
        this.TipoDeCartas = TipoDeCartas;
        this.ValorCarta = ValorCarta;
    }
    //

    public String  toString(){
        return "Carta  : " + NombreCarta + " Tipo de Carta : " + TipoDeCartas + "Valor  : " +  ValorCarta;
    }
    // public String getNombreCarta() {
    //     return NombreCarta;
    // }

    // public Tipo getTipoDeCartas() {
    //     return TipoDeCartas;
    // }

    // public Integer getValorCarta() {
    //     return ValorCarta;
    // }

    enum Tipo {
        Curacion,
        Ataque,
        Vida

    }
}
