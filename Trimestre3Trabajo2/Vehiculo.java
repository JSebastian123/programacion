package Trimestre3Trabajo2;

public abstract class Vehiculo {
    private int rueda;
    private String matricula;
    public Vehiculo(int rueda,String matricula){
        this.rueda = rueda;
        this.matricula = matricula;
    }
    public int getRueda(){
        return rueda;
    }
    public String getMatricula() {
        return matricula;
    }
    @Override
    public String toString(){
        return matricula + ", Puertas" + rueda;
    }
}
