
public class Start {

	public static void main(String[] args) {
		Node raiz = new Node("Ana");
		Node lorenzo = new Node("Lorenzo");
		GenericTree arvoreExemplo 
		= new GenericTree(raiz);
		
		raiz.addChild(lorenzo);
		
		System.out.println("Ana é nó interno? " + raiz.isInternal());
		System.out.println("Ana é nó externo? " + raiz.isExternal());
		System.out.println("Lorenzo é nó interno? " + lorenzo.isInternal());
		System.out.println("Lozenzo é nó externo? " + lorenzo.isExternal());
		System.out.println("Pai do Lorenzo?" + lorenzo.getDadNode());
	}
}
