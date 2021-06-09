package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    public static SalaDeJuntas get(String type)
    {
        return switch (type) {
            case "Sala A" -> new salaDeJuntasA();
            case "Sala B" -> new salaDeJuntasB();
            case "Sala C" -> new salaDeJuntasC();
            default -> null;
        };
    }
}
