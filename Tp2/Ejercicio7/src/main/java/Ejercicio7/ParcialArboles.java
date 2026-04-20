package Ejercicio7;
public class ParcialArboles {
    protected BinaryTree<Integer> arbol;

    public boolean isLeftTree (int num){
        if (arbol.isEmpty()){
            return false;
        }
        BinaryTree<Integer> node = findNode(arbol, num);
        if (node == null){
            return false;
        }
        return cantHijos(node.getLeftChild()) > cantHijos(node.getRightChild());
    }
    
    private BinaryTree<Integer> findNode(BinaryTree<Integer> tree, int num){
        if (tree == null || tree.isEmpty()){
            return null;
        }
        if (tree.getData() == num){
            return tree;
        }
        BinaryTree<Integer> leftResult = findNode(tree.getLeftChild(), num);
        if (leftResult != null){
            return leftResult;
        }
        return findNode(tree.getRightChild(), num);
    }

    private int cantHijos(BinaryTree<Integer> tree){
        if (tree.isEmpty()){
            return -1;
        }
        if (tree.isLeaf()){
            return 0;
        } 
        if ((tree.hasLeftChild() && !tree.hasRightChild()) || (!tree.hasLeftChild() && tree.hasRightChild())){
            return 1 + cantHijos(tree.getLeftChild());
        }
        return -1 + cantHijos(tree.getLeftChild()) + cantHijos(tree.getRightChild());
    }
}
