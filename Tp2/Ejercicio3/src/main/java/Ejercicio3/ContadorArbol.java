package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {
    /// Atributos
    protected BinaryTree<Integer> arbol;

    public ContadorArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public List<Integer> numerosPares() {
        List<Integer> resultado = new ArrayList<>();
        inorderPares(this.arbol, resultado);
        return resultado;
    }

    public List<Integer> numerosParesPostOrden() {
        List<Integer> resultado = new ArrayList<>();
        postorderPares(this.arbol, resultado);
        return resultado;
    }

    private void inorderPares(BinaryTree<Integer> nodo, List<Integer> resultado) {
        if (nodo.isEmpty()) {
            return;
        }
        if (nodo.hasLeftChild()) {
            inorderPares(nodo.getLeftChild(), resultado);
        }
        Integer valor = nodo.getData();
        if (valor != null && valor % 2 == 0) {
            resultado.add(valor);
        }
        if (nodo.hasRightChild()) {
            inorderPares(nodo.getRightChild(), resultado);
        }
    }

    private void postorderPares(BinaryTree<Integer> nodo, List<Integer> resultado) {
        if (nodo == null || nodo.isEmpty()) {
            return;
        }
        if (nodo.hasLeftChild()) {
            postorderPares(nodo.getLeftChild(), resultado);
        }
        if (nodo.hasRightChild()) {
            postorderPares(nodo.getRightChild(), resultado);
        }
        Integer valor = nodo.getData();
        if (valor != null && valor % 2 == 0) {
            resultado.add(valor);
        }
    }
}
