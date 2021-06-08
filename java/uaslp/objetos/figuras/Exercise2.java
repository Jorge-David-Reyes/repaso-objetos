package uaslp.objetos.figuras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    // CREA LAS CLASES Y METODOS NECESARIOS PARA QUE EL TEST SE EJECUTE CORRECTAMENTE

    // EVITA USAR LOS ATAJOS DEL IDE PARA CREAR CLASES, METODOS Y VARIABLES

    // NO DEBES MODIFICAR PARA NADA ESTA CLASE

    @Test
    public void testTrianguloDescription(){
        // Given:
        Triangulo triangulo = new Triangulo();

        // When:
        String description = triangulo.getDescription();

        // Then:
        Assertions.assertEquals("Cualquier triangulo", description);
    }

    @Test
    public void testTrianguloEquilateroDescription(){
        // Given:
        Triangulo triangulo = new TrianguloEquilatero();

        // When:
        String description = triangulo.getDescription();

        // Then:
        Assertions.assertEquals("Lados iguales", description);
    }

    @Test
    public void testTrianguloEscalenoDescription(){
        // Given:
        Triangulo triangulo = new TrianguloEscaleno();

        // When:
        String description = triangulo.getDescription();

        // Then:
        Assertions.assertEquals("Lados diferentes", description);
    }

    @Test
    public void testTrianguloIsocelesDescription(){
        // Given:
        Triangulo triangulo = new TrianguloIsoceles();

        // When:
        String description = triangulo.getDescription();

        // Then:
        Assertions.assertEquals("2 Lados iguales y 1 diferente", description);
    }

    @Test
    public void testListaDeFiguras(){
        // Given:
        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado());
        figuras.add(new PoligonoRegular(5));
        figuras.add(new TrianguloEquilatero());
        figuras.add(new TrianguloEscaleno());
        figuras.add(new TrianguloIsoceles());

        // When/Then:
        Assertions.assertEquals("Cuadrado", figuras.get(0).getName());
        Assertions.assertEquals("Poligono Regular", figuras.get(1).getName());
        Assertions.assertEquals("Triangulo Equilatero", figuras.get(2).getName());
        Assertions.assertEquals("Triangulo Escaleno", figuras.get(3).getName());
        Assertions.assertEquals("Triangulo Isoceles", figuras.get(4).getName());

        Assertions.assertTrue(figuras.get(0) instanceof  Cuadrado);
        Assertions.assertTrue(figuras.get(1) instanceof  PoligonoRegular);
        Assertions.assertTrue(figuras.get(2) instanceof  TrianguloEquilatero);
        Assertions.assertTrue(figuras.get(3) instanceof  TrianguloEscaleno);
        Assertions.assertTrue(figuras.get(4) instanceof  TrianguloIsoceles);

        Assertions.assertTrue(figuras.get(2) instanceof  Triangulo);
        Assertions.assertTrue(figuras.get(3) instanceof  Triangulo);
        Assertions.assertTrue(figuras.get(4) instanceof  Triangulo);

        Assertions.assertTrue(figuras.get(0) instanceof  DrawableItem);
        Assertions.assertTrue(figuras.get(1) instanceof  DrawableItem);
        Assertions.assertTrue(figuras.get(2) instanceof  DrawableItem);
        Assertions.assertTrue(figuras.get(3) instanceof  DrawableItem);
        Assertions.assertTrue(figuras.get(4) instanceof  DrawableItem);
    }

}