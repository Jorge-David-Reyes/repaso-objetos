package uaslp.objetos.escuela;

import java.util.List;

public class EvaluadorDePromedios {

    public double evalua(List<Double> calificaciones){
        double sum = calificaciones.stream().reduce(0.0, Double::sum);

        return sum / calificaciones.size();
    }
}
