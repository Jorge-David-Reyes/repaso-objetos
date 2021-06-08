package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Triangulo;

public class TrianguloEquilatero extends Triangulo {
    private String name = "Triangulo Equilatero";

    public TrianguloEquilatero(){

    }

    public String getDescription(){

        return "Lados iguales";
    }

    public String getName(){
        return name;
    }
}
