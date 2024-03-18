package trimestre3;

public class Circulo extends Figura{
        private Double radio;
        
        public Circulo(Double radio){
            this.radio = radio;
        }

        @Override
        public void calcularPermitro() {
            double permitro = Math.PI*(this.radio*2);
            System.out.println(permitro);
        }
        @Override
        public void calcularArea() {
            Double rad = 2*Math.PI*this.radio;
            System.out.println(rad);
        }

        
}
