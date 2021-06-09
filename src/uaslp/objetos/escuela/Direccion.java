package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion dir;
    private String value;

    private Direccion() {

    }

    public static Direccion getInstance() {
        if(dir==null){
            dir = new Direccion();
        }
        return dir;
    }

}
