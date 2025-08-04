public class GenericTree {
	Node root;
	
	public GenericTree(Node root) {
		this.root = root;
	}
	public int getSize() {
			//faz a varredura e retorna a quantidade
			return 1;
	}
	public void printPreOrder() {
		printPreOrder(root);
	}
	
	public void printPreOrder(Node x) {
		//raiz primeiro, Esquerda, Direita
		System.out.print(x.getData() + " ");
		if (x.isExternal()) //se não tem filhos
			//System.out.print(x.getData() + " ");
			return;
		else {
			for (int i = 0; i < x.getChildren().size(); i++) {
				printPreOrder(x.getChildren().get(i));
			}
		}	
	}
	public void printPostOrder() {
		System.out.println("Itens da árvore");
		//Esquerda, Direita, Raiz
	}
	public void printInOrder() {
		//Esquerda, raiz, Direita
		System.out.println("Itens da árvore");
	}
	
	public int getDegree() {
		return 1;
	}

}
