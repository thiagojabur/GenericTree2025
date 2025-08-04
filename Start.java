
public class Start {

	public static void main(String[] args) {
		Node raiz = new Node("Ana");
		Node lorenzo = new Node("Lorenzo");
		Node gabriel = new Node("Gabriel");
		Node bruno = new Node("Bruno");
		GenericTree arvoreExemplo 
		= new GenericTree(raiz);
		
		raiz.addChild(lorenzo);
		raiz.addChild(gabriel);
		
		lorenzo.addChild(bruno);
		lorenzo.addChild(new Node("Ricardo"));
		
		gabriel.addChild(new Node("Matheus"));
		
		arvoreExemplo.printPreOrder();
	}
}
