package Ejercicio8;

public class ParcialArboles {
    protected BinaryTree<Integer> arbol1;
    protected BinaryTree<Integer> arbol2;

    public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2)
    {
        if (arbol1 == null)
        {
            return true; 
        }
        if (arbol2 == null)
        {
            return false;
        }
        if (!arbol1.getData().equals(arbol2.getData())){
            return false;
        }
        return esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild()) && esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
    }
}
