
public class HeadNode extends Node{
	//head = null;
	//RowHeadNode;
	//ColumnHeadNode;
	
public HeadNode(int value)
	{
		System.out.println("the first headnode value" + value);
		//Why can't HeadNode access value? Is it because its private?
		HeadNode.value = 0;
		//ValueNode createValue = new ValueNode(value);
	}


public HeadNode getNext(HeadNode head)
	{
		return head;
	}

public HeadNode getFirst(HeadNode head)
	{
		return head;
	}

public void insert(ValueNode valueNode)
	{
		return valueNode;
	}

public ValueNode get(ValueNode nodeValue)
	{
		return nodeValue;
	}

}
