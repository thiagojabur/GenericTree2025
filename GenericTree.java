public class GenericTree {
	Node root;
	int size;
	
	public GenericTree(Node root) {
		this.root = root;
	}
	public int getSize() {
			return size;
	}
	public void printPreOrder() {
		System.out.println("Itens da árvore");
	}
	
	public int getDegree() {
		return 1;
	}

}
