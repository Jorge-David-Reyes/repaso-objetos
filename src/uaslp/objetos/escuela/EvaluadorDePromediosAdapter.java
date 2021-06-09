package uaslp.objetos.escuela;

public class EvaluadorDePromediosAdapter {
    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluador){

    }

    public double evalua(String ListaDeCalificaciones){
        double promedio=0;
        String[] calificaciones = ListaDeCalificaciones.split(",");

        for(int i=0; i<calificaciones.length; i++)
            promedio = promedio + Double.parseDouble(calificaciones[i]);

        promedio = promedio/ calificaciones.length;

        return promedio;
    }
}
