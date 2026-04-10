package Ejercicio8;

public class CircularQueue<T> extends Queue<T>
{
    public T shift (){
        if (this.isEmpty())
        {
            throw new RuntimeException("La cola está vacía");
        }
        this.enqueue(this.dequeue());
        return this.dequeue();
    }
}