
public class SparseMatrix extends Node{
	private HeadNode head = null;
	
public SparseMatrix()
	{
		head = null;	
	}

//Is the add function supposed to be in SparseMatrix?
public void add(int value)
	{
		if(head == null){
			head = new HeadNode(3);
		//	ColumnHeadNode columnHead = new ColumnHeadNode(3);
		}
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

}

