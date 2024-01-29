package SlayJava;

public class Cartas {
    private String NombreCarta;
    private Tipo TipoDeCartas;
    private Integer ValorCarta;
    private boolean yaJugada;

    // private String TipoDeLaCarta;
    public Cartas(String NombreCarta, Tipo TipoDeCartas, Integer ValorCarta) {
        this.setNombreCarta(NombreCarta);
        this.setTipoDeCartas(TipoDeCartas);
        this.setValorCarta(ValorCarta);
        this.yaJugada = false;
    }

    public boolean isYaJugada() {
        return yaJugada;
    }

    public void setYaJugada(boolean yaJugada) {
        this.yaJugada = yaJugada;
    }

    //
    public void setNombreCarta(String nombreCarta) {
        NombreCarta = nombreCarta;
    }

    public void setTipoDeCartas(Tipo tipoDeCartas) {
        TipoDeCartas = tipoDeCartas;
    }

    public void setValorCarta(Integer valorCarta) {
        ValorCarta = valorCarta;
    }

    public String getNombreCarta() {
        return NombreCarta;
    }

    public Tipo getTipoDeCartas() {
        return TipoDeCartas;
    }

    public Integer getValorCarta() {
        return ValorCarta;
    }

    public String toString() {
        return "Carta  : " + NombreCarta + " Tipo de Carta : " + TipoDeCartas + "Valor  : " + ValorCarta;
    }
    // metodo toString(){} no necesitamos getter

    enum Tipo {
        Curacion,
        Ataque,
        Vida,
        Stun

    }

    public Tipo setCartaActual(Cartas cartaJ1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCartaActual'");
    }
}
