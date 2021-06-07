package uaslp.objetos.figuras;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado){
        this.lado=lado;
    }

    public Cuadrado() {

    }

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getArea(){
        return lado*lado;
    }

    public double getLado(){
        return lado;
    }
}
