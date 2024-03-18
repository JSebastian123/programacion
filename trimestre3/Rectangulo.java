package trimestre3;

public class Rectangulo extends Figura{
    
        private Double base, altura;
        public Rectangulo(Double base,Double altura){
            this.base = base;
            this.altura = altura;
        }
        @Override
        public void calcularArea() {
            double area = base * altura;
            System.out.println(area);
        }
        @Override
        public void calcularPermitro() {
            Double areaRectangulo = (2*base) * (2*altura);
            System.out.println(areaRectangulo);
        }
}
