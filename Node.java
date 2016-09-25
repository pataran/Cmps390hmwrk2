
public class Node {
	protected Node nextInRow;
	protected Node nextInColumn;
	
	public Node getNextInRow() {
		return this.nextInRow;
	}
	public void setNextInRow(Node nextInRow) {
		this.nextInRow = nextInRow;
	}
	public Node getNextInColumn() {
		return nextInColumn;
	}
	public void setNextInColumn(Node nextInColumn) {
		this.nextInColumn = nextInColumn;
	}
		
}

