
public class Start {

	public static void main(String[] args) {
		Node raiz = new Node("Ana");
		Node lorenzo = new Node("Lorenzo");
		GenericTree arvoreExemplo 
		= new GenericTree(raiz);
		
		raiz.addChild(lorenzo);
		
		System.out.println("Ana � n� interno? " + raiz.isInternal());
		System.out.println("Ana � n� externo? " + raiz.isExternal());
		System.out.println("Lorenzo � n� interno? " + lorenzo.isInternal());
		System.out.println("Lozenzo � n� externo? " + lorenzo.isExternal());
		System.out.println("Pai do Lorenzo?" + lorenzo.getDadNode());
	}
}
