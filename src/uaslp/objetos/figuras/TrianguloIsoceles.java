package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo {
    private String name = "Triangulo Isoceles";

    public TrianguloIsoceles(){

    }

    public String getDescription(){
        return "2 Lados iguales y 1 diferente";
    }

    public String getName(){
        return name;
    }
}
