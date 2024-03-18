package trimestre3;



public class Cuadrado extends Figura{
    private Double lado;
    public Cuadrado(Double lado){
        this.lado = lado;
    }
  
    @Override
    public void calcularPermitro() {
        double permitro = 2*(this.lado);
       System.out.println(permitro);
    }
    @Override
    public void calcularArea() {
        Double rad = 2*Math.PI*this.lado;
        System.out.println(rad);

    }
}
