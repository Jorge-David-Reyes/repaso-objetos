package uaslp.objetos.escuela;

public class AlgoritmoX {

    private final Dependencia1 dependencia1;
    private final Dependencia2 dependencia2;
    private final Dependencia3 dependencia3;

    public AlgoritmoX(Dependencia1 dependencia1,
                      Dependencia2 dependencia2,
                      Dependencia3 dependencia3) {
        this.dependencia1 = dependencia1;
        this.dependencia2 = dependencia2;
        this.dependencia3 = dependencia3;
    }

    public void algoritmoACubrir(int a, int b, String c){

        if(a == b){
            dependencia1.save(c);
        } else if(a < b){
            dependencia2.print(a, c);
        } else {
            dependencia3.send(a, b);
        }

        dependencia3.recover();
    }
}
