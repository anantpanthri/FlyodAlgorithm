
public class Node {

	private int data;
	private Node previousNode;
	private Node nextNode;
	/**
	 * @return the data
	 */
	protected int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	protected void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the previousNode
	 */
	protected Node getPreviousNode() {
		return previousNode;
	}
	/**
	 * @param previousNode the previousNode to set
	 */
	protected void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	/**
	 * @return the nextNode
	 */
	protected Node getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	protected void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
	
}
