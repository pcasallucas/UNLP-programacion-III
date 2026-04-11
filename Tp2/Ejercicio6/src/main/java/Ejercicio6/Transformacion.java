package Ejercicio6;

public class Transformacion {
    BinaryTree<Integer> arbol = new BinaryTree<>();

    public BinaryTree<Integer> suma(BinaryTree<Integer> arbol){
        BinaryTree<Integer> nuevoArbol = new BinaryTree<>();
        if (arbol.isEmpty()) {
            return nuevoArbol;
        }
        nuevoArbol.setData(arbol.getData() + suma(arbol.getLeftChild()).getData() + suma(arbol.getRightChild()).getData());
        return nuevoArbol;
    }

}
