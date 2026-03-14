package Ejercio3.clases;

public class Profesor extends Persona {
    private String catedra;
    private String facultad;

    public Profesor(String nombre, String apellido, String email, String catedra) {
        super(nombre, apellido, email);
        this.catedra = catedra;
    }

    public String getcatedra() {
        return catedra;
    }

    public void setcatedra(String catedra) {
        this.catedra = catedra;
    }

    public String getfacultad() {
        return facultad;
    }

    public void setfacultad(String facultad) {
        this.facultad = facultad;
    }

    public String tusDatos() {
        return "Profesor: " + getNombre() + " " + getApellido() + ", Catedra: " + getcatedra() + ", Facultad: " + getfacultad() + ", Email: " + getEmail();
    }
}
