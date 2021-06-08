package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    private double lado;
    private int numeroDeLados;
    private String name = "Poligono Regular";

    public PoligonoRegular(int numeroDeLados, double lado){
        this .numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public PoligonoRegular(int numeroDeLados) {

        if(numeroDeLados < 5)
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        else
            this.numeroDeLados=numeroDeLados;
    }

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getArea(){
        double apotema;
        double angulo;
        double perimietro;

        angulo = (double)360/(2*numeroDeLados);
        angulo = Math.toRadians(angulo);
        angulo = Math.tan(angulo);
        apotema = lado/(2*angulo);
        perimietro = lado*numeroDeLados;

        return (perimietro*apotema)/2;
    }

    public double getLado(){
        return lado;
    }

    public String getName(){
        return name;
    }
}
