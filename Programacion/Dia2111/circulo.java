package Dia2111;

public class circulo {
    // nos pide varias varibles
    // circulo
    private double radio;
    private double area;
    private double circunferencia;
    private double pi = 3.14;
    private double circulo;

    public circulo(double radio, double circulo, double area, double pi,double circunferencia) {
        this.setRadio(radio);
        this.setCirculo(circulo);
        this.setArea(area);
        this.setCircunferencia(circunferencia);
        this.setPi(pi);
    }
    public circulo(double radio, double circulo, double area, double pi) {
        this.setRadio(radio);
        this.setCirculo(circulo);
        this.setArea(area);
        this.setPi(pi);
    }
    // inicialices una factura mediante su constructor y use el metodo imprimrr

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getCirculo() {
        return circulo;
    }

    public void setCirculo(double circulo) {
        this.circulo = circulo;
    }

    // area
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // circunferencia
    public double getCircunferencai() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }
     public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
}
