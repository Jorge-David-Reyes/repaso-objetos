package uaslp.objetos.escuela;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.time.Month;

public class Exercise4 {

    @Test
    public void testBuilder() {

        // Given:
        Alumno alumno = Alumno.builder()
                .nombre("Pablo Lopez")
                .clave("1231254")
                .claveDeCarrera("312542")
                .anioDeIngreso(2020)
                .fechaNacimiento(LocalDate.of(2002, Month.APRIL, 12))
                .build();


        // Then:
        Assertions.assertEquals("Pablo Lopez", alumno.getNombre());
        Assertions.assertEquals("1231254", alumno.getClave());
        Assertions.assertEquals("312542", alumno.getClaveDeCarrera());
        Assertions.assertEquals(2020, alumno.getAnioDeIngreso());
        Assertions.assertEquals(LocalDate.of(2002, Month.APRIL, 12), alumno.getFechaNacimiento());
    }

    @Test
    public void testFactory() {
        // Given:
        SalaDeJuntas salaDeJuntasA = SalaDeJuntasFactory.get("Sala A");
        SalaDeJuntas salaDeJuntasB = SalaDeJuntasFactory.get("Sala B");
        SalaDeJuntas salaDeJuntasC = SalaDeJuntasFactory.get("Sala C");

        // Then:
        Assertions.assertNotSame(salaDeJuntasA, salaDeJuntasB);
        Assertions.assertNotSame(salaDeJuntasA, salaDeJuntasC);
        Assertions.assertNotSame(salaDeJuntasB, salaDeJuntasC);
        Assertions.assertEquals("Sala A", salaDeJuntasA.getNombre());
        Assertions.assertEquals("Sala B", salaDeJuntasB.getNombre());
        Assertions.assertEquals("Sala C", salaDeJuntasC.getNombre());
        Assertions.assertSame(salaDeJuntasA, SalaDeJuntasFactory.get("Sala A"));
        Assertions.assertSame(salaDeJuntasB, SalaDeJuntasFactory.get("Sala B"));
        Assertions.assertSame(salaDeJuntasC, SalaDeJuntasFactory.get("Sala C"));
    }

    @Test
    public void testSingleton() {
        // Given:
        Direccion direccion1 = Direccion.getInstance();
        Direccion direccion2 = Direccion.getInstance();
        Direccion direccion3 = Direccion.getInstance();
        Constructor<Direccion> constructor = ReflectionUtils.getDeclaredConstructor(Direccion.class);
        int constructorModifiers = constructor.getModifiers();

        // Then:
        Assertions.assertSame(direccion1, direccion2);
        Assertions.assertSame(direccion2, direccion3);
        Assertions.assertSame(direccion1, direccion3);
        Assertions.assertTrue(Modifier.isPrivate(constructorModifiers));
    }

}
