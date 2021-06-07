package uaslp.objetos.figuras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1 {

    // CREA LAS CLASES Y METODOS NECESARIOS PARA QUE EL TEST SE EJECUTE CORRECTAMENTE

    // EVITA USAR LOS ATAJOS DEL IDE PARA CREAR CLASES, METODOS Y VARIABLES

    // NO DEBES MODIFICAR PARA NADA ESTA CLASE

    @Test
    public void testCuadrado(){
        // Given:
        Cuadrado cuadrado = new Cuadrado();
        double lado = 10;

        cuadrado.setLado(lado);

        // When:
        double area = cuadrado.getArea();

        // Then:
        Assertions.assertEquals(100, area);
    }

    @Test
    public void testConstructorCuadrado(){
        // Given:
        double lado = 10;
        Cuadrado cuadrado = new Cuadrado(lado);

        // When:
        double area = cuadrado.getArea();

        // Then:
        Assertions.assertEquals(lado, cuadrado.getLado());
        Assertions.assertEquals(100, area);
    }

    @Test
    public void testTriangulo(){
        // Given:
        Triangulo triangulo = new Triangulo();
        double base = 10;
        double altura = 3;

        triangulo.setBase(base);
        triangulo.setAltura(altura);

        // When:
        double area = triangulo.getArea();

        // Then:
        Assertions.assertEquals(15, area);
    }

    @Test
    public void testConstructorTriangulo(){
        // Given:
        double base = 10;
        double altura = 3;
        Triangulo triangulo = new Triangulo(base, altura);

        // When:
        double area = triangulo.getArea();

        // Then:
        Assertions.assertEquals(base, triangulo.getBase());
        Assertions.assertEquals(altura, triangulo.getAltura());
        Assertions.assertEquals(15, area);
    }

    @Test
    public void testPoligono(){
        // Given:
        double lado = 10;
        int numeroDeLados = 6;
        PoligonoRegular poligono = new PoligonoRegular(numeroDeLados);

        poligono.setLado(lado);

        // When:
        double area = poligono.getArea();

        // Then:
        Assertions.assertEquals(259.8076211353316, area);
    }

    @Test
    public void testConstructorPoligono(){
        // Given:
        double lado = 10;
        int numeroDeLados = 6;
        PoligonoRegular poligono = new PoligonoRegular(numeroDeLados, lado);

        // When:
        double area = poligono.getArea();

        // Then:
        Assertions.assertEquals(lado, poligono.getLado());
        Assertions.assertEquals(259.8076211353316, area);
    }

}