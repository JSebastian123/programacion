package Trimestre3Trabajo2;

public class Coche extends Vehiculo {
    private int puertas;

    public Coche(int rueda,String matricula, int puertas){
        super(rueda = 4,matricula);
        this.puertas = puertas;
    }
    
    // Método público toString()
    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + puertas;
    }

}


