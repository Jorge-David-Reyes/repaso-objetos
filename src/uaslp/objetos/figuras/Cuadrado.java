package uaslp.objetos.figuras;

public class Cuadrado extends Figura{
    private double lado;
    private String name="Cuadrado";

    public Cuadrado(double lado){
        this.lado=lado;
    }

    public Cuadrado() {

    }
    public void setLado(double lado){
        this.lado=lado;
    }

    public double getArea(){
        double area;
        area = lado*lado;

        if(area != 0)
            return area;
        else
            throw new LadoNoProvistoException();
    }

    public double getLado(){
        return lado;
    }

    public String getName(){

        return name;
    }
}
