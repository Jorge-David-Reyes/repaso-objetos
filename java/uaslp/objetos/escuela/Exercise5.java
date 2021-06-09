package uaslp.objetos.escuela;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class Exercise5 {

    @Test
    public void testAdapter() {
        // Given:
        String listaDeCalificaciones = "8.7,8.5,9.4,9.8,6.4,10,10,8.9,9.8,8";
        EvaluadorDePromedios evaluadorDePromedios = Mockito.mock(EvaluadorDePromedios.class);
        EvaluadorDePromediosAdapter evaluadorDePromediosAdapter = new EvaluadorDePromediosAdapter(evaluadorDePromedios);
        List<Double> calificaciones = Arrays.asList(8.7, 8.5, 9.4, 9.8, 6.4, 10.0, 10.0, 8.9, 9.8, 8.0);

        when(evaluadorDePromedios.evalua(calificaciones)).thenReturn(8.7);

        // When:
        double promedio = evaluadorDePromediosAdapter.evalua(listaDeCalificaciones);

        // Then:
        assertThat(promedio).isEqualTo(8.7);
        verify(evaluadorDePromedios).evalua(calificaciones);
        verifyNoMoreInteractions(evaluadorDePromedios);

    }

    @Test
    public void testAdapterSinMocks() {
        // Given:
        String listaDeCalificaciones = "8.7,8.5,9.4,9.8,6.4,10,10,8.9,9.8,8";
        EvaluadorDePromedios evaluadorDePromedios = new EvaluadorDePromedios();
        EvaluadorDePromediosAdapter evaluadorDePromediosAdapter = new EvaluadorDePromediosAdapter(evaluadorDePromedios);


        // When:
        double promedio = evaluadorDePromediosAdapter.evalua(listaDeCalificaciones);

        // Then:
        assertThat(promedio).isEqualTo(8.95);
    }

}
