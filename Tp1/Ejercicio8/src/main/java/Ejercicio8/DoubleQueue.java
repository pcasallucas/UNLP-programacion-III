package Ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class DoubleQueue<T> extends Queue<T>
{
    public void shift (){
        int derecha = this.size() - 1;
        if (this.isEmpty())
        {
            throw new RuntimeException("La cola está vacía");
        }
        for (int izquierda = 0; izquierda < derecha; izquierda++)
        {
            this.enqueue(this.dequeue());
            derecha--;
        }
    }

    public void enqueueFirst(T dato)
    {
        List<T> temp = new ArrayList<>();
        while (!this.isEmpty())
        {
            temp.add(this.dequeue());
        }
        this.enqueue(dato);
        for (T e : temp)
        {
            this.enqueue(e);
        }
    }
}