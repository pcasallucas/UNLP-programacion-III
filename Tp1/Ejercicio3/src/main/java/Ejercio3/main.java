
package Ejercio3;

public class main {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Ejercio3.clases.Estudiante[] estudiantes = new Ejercio3.clases.Estudiante[2];
        estudiantes[0] = new Ejercio3.clases.Estudiante("juan", "perez", "juan@unlp.edu.ar", "comision1", "direccion1");
        estudiantes[1] = new Ejercio3.clases.Estudiante("maria", "lopez", "maria@unlp.edu.ar", "comision2", "direccion2");
        Ejercio3.clases.Profesor[] profesores = new Ejercio3.clases.Profesor[3];
        profesores[0] = new Ejercio3.clases.Profesor("pedro", "gomez", "pedro@unlp.edu.ar", "catedra1");
        profesores[1] = new Ejercio3.clases.Profesor("laura", "ruiz", "laura@unlp.edu.ar", "catedra2");
        profesores[2] = new Ejercio3.clases.Profesor("carlos", "sanchez", "carlos@unlp.edu.ar", "catedra3");

        for (Ejercio3.clases.Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.tusDatos());
        }
        for (Ejercio3.clases.Profesor profesor : profesores) {
            System.out.println(profesor.tusDatos());
        }
    }
}
