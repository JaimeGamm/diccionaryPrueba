package structures;

import java.util.Comparator;

public class BinaryTree<T> {
	
	private Node<T> root;
	private Comparator<T> comparator;
	
	public BinaryTree(Comparator<T> comparator) {
		root = null;
		this.comparator=comparator;
	}
	public boolean isEmpty() {
		return root == null;
	}
	public void insert(T data) {
		Node<T> node = new Node<T>(data);
		if(isEmpty()) {
			root = node;
		}else {	
			Node<T> aux = null;
			Node<T> tour= root;
			while(tour!=null) {
				aux =tour;
				if(comparator.compare(tour.getData(), data)>0) {
					tour=tour.getRight();
				}else {
					tour=tour.getLeft();
				}
			}
			if(comparator.compare(aux.getData(), data)>0) {
				aux.setRight(node);
			}else {
				aux.setLeft(node);
			}
		}
	}
	
	public T search(T data) {
		T searchData=null;
		if(!isEmpty()) {
			if(comparator.compare(root.getData(), data)==0) {
				searchData=root.getData();
			}else {
				Node<T> aux = null;
				Node<T> tour= root;
				while(tour!=null) {
					aux =tour;
					if(comparator.compare(tour.getData(), data)>0) {
						tour=tour.getRight();
					}else {
						tour=tour.getLeft();
					}
					if(comparator.compare(aux.getData(), data)==0) {
						searchData=aux.getData();
					}
					System.out.println(aux.getData());
				}
			}
		}
		return searchData;
	}
	
	public boolean exist(T data) {
		boolean existData=false;
		if(!isEmpty()) {
			if(comparator.compare(root.getData(), data)==0) {
				existData=true;
			}else {
				Node<T> aux = null;
				Node<T> tour= root;
				while(tour!=null) {
					aux =tour;
					if(comparator.compare(tour.getData(), data)>0) {
						tour=tour.getRight();
					}else {
						tour=tour.getLeft();
					}
					if(comparator.compare(aux.getData(), data)==0) {
						existData=true;
					}
				}
				
			}
		}
		return existData;
	}
	public String showRight() {
		StringBuilder responsa = new StringBuilder();
		Node<T> actual = root;
		while(actual!=null) {
			responsa.append(actual.getData());
			actual=actual.getRight();
		}
		return responsa.toString();
	}
	
	public String showleft() {
		StringBuilder responsa = new StringBuilder();
		Node<T> actual = root;
		while(actual!=null) {
			responsa.append(actual.getData());
			actual=actual.getLeft();
		}
		return responsa.toString();
	}
}
