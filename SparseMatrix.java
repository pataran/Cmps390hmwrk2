
public class SparseMatrix extends Node{
HeadNode primaryHead = null;
RowHeadNode rowHead;
ColumnHeadNode columnHead;
public SparseMatrix(int row, int col)

	//Start by creating the primaryHeadNode, then construct the first rowheadnode and columnheadnode
	{
	if( primaryHead == null){
		primaryHead = new HeadNode();
		primaryHead.insert(new ValueNode());
		primaryHead.setNextInRow(new RowHeadNode());
			System.out.println("first rowhead is 1 at address " + primaryHead.getNextInRow());
		primaryHead.setNextInColumn(new ColumnHeadNode());
			System.out.println("first columnhead is 1 at address " + primaryHead.getNextInColumn());
	
	
	//Temp Creates the Row columns starting at 2 since 1 is created with primary head, points back to primaryHead
	//to create a circular list
	int rowCounter = 2;
	
	RowHeadNode currentRowHead = null;
	RowHeadNode nextRowHead = null;
	
	while(rowCounter != row + 1){
		currentRowHead = (RowHeadNode) primaryHead.getNextInRow();
		currentRowHead.insert(new ValueNode());
	    currentRowHead.setNextInRow(new RowHeadNode());
		nextRowHead = (RowHeadNode) currentRowHead.getNextInRow();
		currentRowHead = nextRowHead;
			System.out.println(currentRowHead + " current row address at position: " + rowCounter);
		rowCounter++;
	}
		currentRowHead.setNextInRow(primaryHead);
			System.out.println(currentRowHead.getNextInRow() + "row list end should point back to address of primaryhead");
	
	
	//Temp Creates the Column rows starting at 2 since 1 is created with primary head, points back to primaryHead
	//to create a circular list
	int columnCounter = 2;
	
	ColumnHeadNode currentColumnHead = null;
	ColumnHeadNode nextColumnHead = null;
	
	while(columnCounter != col + 1){
		currentColumnHead = (ColumnHeadNode) primaryHead.getNextInColumn();
		currentColumnHead.setNextInColumn(new ColumnHeadNode());
		nextColumnHead = (ColumnHeadNode) currentColumnHead.getNextInColumn();
		currentColumnHead = nextColumnHead;
			System.out.println(currentColumnHead + " current column address at position: " + columnCounter);
		columnCounter++;
	}
	currentColumnHead.getNext(primaryHead);
	
	currentColumnHead.setNextInColumn(primaryHead);
		System.out.println(currentColumnHead.getNextInColumn() + " column list end should point back to address of primaryhead");
	}
	
	//Test print the header lists
	printHeaderRow(primaryHead);
	printHeaderColumn(primaryHead);
	}

public void insert(int row, int column, int value)
	{
	
	}

public int getValue(int row, int column)
	{
		return 1;
	}

public int getRow(int position)
	{
		return 1;
	}

public int getColumn(int position)
	{
		return 1;
	}

public SparseMatrix transpose(SparseMatrix matrix)
	{
		return matrix;
	}

public void printHeaderColumn(HeadNode head){
	HeadNode headStart = head;
	while(head.nextInColumn != headStart){
		//Checks to make sure the list is circular, if its null it is not
		if(head.nextInColumn == null){
			System.out.println(head + " the print is failing here for some reason");
		}
		
		System.out.println("diplaying column start address@ " + head);
		head = (HeadNode) head.nextInColumn;
	}
}


public void printHeaderRow(HeadNode head){
	HeadNode headStart = head;
	while(head.nextInRow != headStart){
		//Checks to make sure the list is circular, if its null it is not
		if(head.nextInRow == null){
			System.out.println(head + " the print is failing here for some reason");
		}
		
		System.out.println("displaying head addresses@ " + head);
		head = (HeadNode) head.nextInRow;
	}

}

}

