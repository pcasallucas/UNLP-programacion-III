package Ejercicio5;
public class ProfundidadDeArbolBinario {
    BinaryTree<Integer> arbol = new BinaryTree<>();

    public int sumaElementosProfundidad(BinaryTree<Integer> arbol, int profundidad) {
        if (arbol.isEmpty()) {
            return 0;
        } else if (profundidad == 0) {
            return arbol.getData();
        } else {
            int leftSum = sumaElementosProfundidad(arbol.getLeftChild(), profundidad - 1);
            int rightSum = sumaElementosProfundidad(arbol.getRightChild(), profundidad - 1);
            return leftSum + rightSum;
        }
    }
}
