package Ejercio3.clases;

public class Estudiante extends Persona {
    private String comision;
    private String direccion;

    public Estudiante(String nombre, String apellido, String email, String comision, String direccion) {
        super(nombre, apellido, email);
        this.comision = comision;
        this.direccion = direccion;
    }

    public String getcomision() {
        return comision;
    }

    public void setcomision(String comision) {
        this.comision = comision;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String tusDatos() {
        return "Estudiante: " + getNombre() + " " + getApellido() + ", Comision: " + getcomision() + ", Direccion: " + getDireccion() + ", Email: " + getEmail();
    }
}