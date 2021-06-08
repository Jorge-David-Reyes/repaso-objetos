package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base=0;
    private double altura=0;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){

    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getArea() {
        double area=0;

        if (altura != 0 && base != 0)
            area = base * altura / 2;
        else if (altura == 0 && base !=0) {
            throw new AlturaNoProvistaException();
        }
        else if (base == 0 && altura != 0) {
            throw new BaseNoProvistaException();
        }
        else if(base == 0 && altura == 0)
            throw new BaseNoProvistaException();

        return area;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public String getDescription(){
        return "Cualquier triangulo";
    }
}
