package Ejercicio10;
import java.util.ArrayList;

public class Fila{
    private  ArrayList<Persona> lista;

    public Fila() {
        this.lista = new ArrayList<>();
    }

    public void enqueue(Persona person) {
        if (person.prioridad()) {
            lista.add(0, person);
        } else {
            lista.add(person);
        }
    }

    public Persona dequeue() {
        if (lista.isEmpty()) {
            throw new RuntimeException("La fila está vacía");
        }
        return lista.remove(0);
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }
}