package Ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<>();
    }

    public int mayorRetardo(BinaryTree<Integer> arbol) {
        if (arbol.isEmpty()) {
            return 0;
        } else {
            int leftChallenge = mayorRetardo(arbol.getLeftChild());
            int rightChallenge = mayorRetardo(arbol.getRightChild());
            return Math.max(leftChallenge, rightChallenge);
        }
    }
}
