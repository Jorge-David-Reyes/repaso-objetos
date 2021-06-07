package uaslp.objetos.figuras;

public class PoligonoRegular {
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados, double lado){
        this .numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public PoligonoRegular(int numeroDeLados) {
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
}
