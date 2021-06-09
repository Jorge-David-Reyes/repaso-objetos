package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String type){
        switch(type){
            case "Sala A":
                return new salaDeJuntasA();
            case "Sala B":
                return new salaDeJuntasB();
            case "Sala C":
                return new salaDeJuntasC();
            default:
                return null;
        }
    }

}
