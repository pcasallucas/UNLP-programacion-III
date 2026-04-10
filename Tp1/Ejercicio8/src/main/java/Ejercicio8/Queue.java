package Ejercicio8;
import java.util.ArrayList;
import java.util.List;

public class Queue<T> extends Sequence<T>
{
    private List<T> list;

// ● Queue() Constructor de la clase
    public Queue()
    {
        this.list = new ArrayList<>();
    }

// ● enqueue(dato: T): Inserta el elemento al final de la cola
    public void enqueue(T dato)
    {
        this.list.add(dato);
    }
// ● dequeue():T Elimina el elemento del frente de la cola y lo retorna. Si la cola está vacía se produce un error.
    public T dequeue()
    {
        if (this.list.isEmpty())
        {
            throw new RuntimeException("La cola está vacía");
        }
        return this.list.remove(0);
    }
// ● head(): T Retorna el elemento del frente de la cola. Si la cola está vacía se produce un error.
    public T head()
    {
        if (this.list.isEmpty())
        {
            throw new RuntimeException("La cola está vacía");
        }
        return this.list.get(0);
    }
// ● isEmpty(): boolean Retorna verdadero si la cola no tiene elementos y falso en caso contrario
    @Override
    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }
// ● size():int Retorna la cantidad de elementos de la cola.
    @Override
    public int size()
    {
        return this.list.size();
    }

// ● toString(): String Retorna los elementos de la cola en un String
    @Override
    public String toString()
    {
        return this.list.toString();
    }

}