package Ejercicio7;
public class ParcialArboles {
    protected BinaryTree<Integer> arbol;

    public boolean isLeftTree (int num){
        if (arbol.isEmpty()){
            return false;
        }
        if (arbol.getData() == num){
            return cantHijos(arbol.getLeftChild()) > cantHijos(arbol.getRightChild());
        }
        return false;
    }

    private int cantHijos(BinaryTree<Integer> tree){
        if (tree.isEmpty()){
            return -1;
        }
        if (tree.isLeaf()){
            return 0;
        } 
        
    }
}
