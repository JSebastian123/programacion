package Dia2111;

import javax.sound.sampled.SourceDataLine;

public class bombilla {

    private boolean estado;
    private int potencia;
    private String color;
    private Double horas;
    public String frase;
    public bombilla(boolean estado, int potencia, String color, Double horas) {
        this.setEstado(estado);
        this.setPotencia(potencia);
        this.setColor(color);
        this.setHora(horas);
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHora(Double horas) {
        this.horas = horas;
    }

    // metodo para ve si esta encendida la bombilla
    public String EstaEncedida(){
       return  frase = (!estado) ?  "no esta encendida" : "si lo esta  encendida";
        
    }
}
