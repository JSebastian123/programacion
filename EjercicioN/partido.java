package EjercicioN;

public class partido {
    private Integer id;
    private String pareja1;
    private String pareja2;
    private boolean resultado;
    private String ganador;
    private Integer ronda;

    
    partido(Integer id, String pareja1, String pareaja2, boolean resulatado, String ganador,Integer ronda  ) {
        this.setId(id);
        this.setGanador(ganador);
        this.setPareja1(pareja1);
        this.setPareja2(pareja2);
        this.setResultado(resulatado);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRonda(Integer ronda) {
        this.ronda = ronda;
    }

    public int getId() {
        return id;
    }

    public String getPareja1() {
        return pareja1;
    }

    public String getPareja2() {
        return pareja2;
    }

    public boolean getResultado() {
        return resultado;
    }

    public String getGanador() {
        return ganador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPareja1(String pareja1) {
        this.pareja1 = pareja1;
    }

    public void setPareja2(String pareja2) {
        this.pareja2 = pareja2;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public Integer getRonda() {
        return ronda;
    }

}
