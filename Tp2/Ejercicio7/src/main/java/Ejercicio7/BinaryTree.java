package Ejercicio7;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas(BinaryTree<T> tree){
	   if (isLeaf()){
		   return 1;
	   } else {
		   int count = 0;
		   if (hasLeftChild()) {
			   count += contarHojas(getLeftChild());
		   }
		   if (hasRightChild()) {
			   count += contarHojas(getRightChild());
		   }
		   return count;
	   }	
	}
		
		
    	 
    public BinaryTree<T> espejo(){
    	if (this.isEmpty()) {
    		return new BinaryTree<>();
    	}
    	
    	BinaryTree<T> mirrorTree = new BinaryTree<>(this.data);
    	
    	if (this.hasLeftChild()) {
    		mirrorTree.addRightChild(this.leftChild.espejo());
    	}
    	
    	if (this.hasRightChild()) {
    		mirrorTree.addLeftChild(this.rightChild.espejo());
    	}
    	
    	return mirrorTree;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if (this.isEmpty()) {
			return;
		}
		
		Queue<BinaryTree<T>> nodeQueue = new LinkedList<>();
		Queue<Integer> levelQueue = new LinkedList<>();
		
		nodeQueue.add(this);
		levelQueue.add(0);
		
		while (!nodeQueue.isEmpty()) {
			BinaryTree<T> current = nodeQueue.poll();
			int level = levelQueue.poll();
			
			if (level >= n && level <= m) {
				System.out.print(current.getData() + " ");
			}
			
			if (level < m) {
				if (current.hasLeftChild()) {
					nodeQueue.add(current.getLeftChild());
					levelQueue.add(level + 1);
				}
				if (current.hasRightChild()) {
					nodeQueue.add(current.getRightChild());
					levelQueue.add(level + 1);
				}
			}
		}
   }
		
}

