package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.time.Month;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaDeNacimiento;

    public static AlumnoBuilder builder() {

        return new AlumnoBuilder();
    }

    public static class AlumnoBuilder {

        private Alumno alumno;

        private AlumnoBuilder() {
            alumno = new Alumno();
        }

        public AlumnoBuilder nombre(String nombre) {
            alumno.nombre(nombre);
            return this;
        }

        public AlumnoBuilder clave(String clave) {
            alumno.clave(clave);
            return this;
        }

        public AlumnoBuilder claveDeCarrera(String claveDeCarrera) {
            alumno.claveDeCarrera(claveDeCarrera);
            return this;
        }

        public AlumnoBuilder anioDeIngreso(int anioDeIngreso) {
            alumno.anioDeIngreso(anioDeIngreso);
            return this;
        }

        public AlumnoBuilder fechaNacimiento(LocalDate of) {
            alumno.fechaDeNacimiento(LocalDate.of(2002, Month.APRIL, 12));
            return this;
        }

        public Alumno build() {
            return alumno;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaDeNacimiento;
    }

    private void fechaDeNacimiento(LocalDate fechaDeNacimineto) {
        this.fechaDeNacimiento=fechaDeNacimineto;
    }

    private void anioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso=anioDeIngreso;
    }

    private void claveDeCarrera(String claveDeCarrera) {
        this.claveDeCarrera=claveDeCarrera;
    }

    private void clave(String clave) {
        this.clave=clave;
    }

    private void nombre(String nombre) {
        this.nombre = nombre;
    }
}

