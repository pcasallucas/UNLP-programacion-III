/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio8;

/**
 *
 * @author pcasa
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        DoubleQueue<Integer> doubleQueue = new DoubleQueue<>();
        doubleQueue.enqueue(1);
        doubleQueue.enqueue(2);
        doubleQueue.enqueue(3);
        doubleQueue.enqueue(4);
        System.out.println("Double Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.dequeue());
        }

        CircularQueue<String> circularQueue = new CircularQueue<>();
        circularQueue.enqueue("A");
        circularQueue.enqueue("B");
        circularQueue.enqueue("C");
        circularQueue.enqueue("D");
        System.out.println("\nCircular Queue:");
        for (int i = 0; i < 8; i++) { // Dequeue more times than the number of elements to show the circular behavior
            System.out.println(circularQueue.shift());
        }
    }
}
