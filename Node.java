import java.util.ArrayList;	
public class Node {
	public String data; 
	Node dadNode;
	ArrayList<Node> children = new ArrayList<>();

	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList<Node> getChildren() {
		return children;
	}

	public Node(String data) {
		this.data = data;
	}
	public Node getDadNode() {
		return dadNode;
	}
	public void setDadNode(Node dadNode) {
		this.dadNode = dadNode;
	}

	public boolean isInternal() {
		return !children.isEmpty();
	}
	public boolean isExternal() {
		return !isInternal();
	}
	
	public String toString() {
		return data;
	}
	public void addChild(Node newNode) {
		children.add(newNode);
		newNode.setDadNode(this);
	}
	
	public int getDegree() {
		return children.size();
	}

}
