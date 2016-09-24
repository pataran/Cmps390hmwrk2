
public class ValueNode extends Node{
private int row = 0;
private int column = 0;
private int value = 0;

ValueNode(int val)
	{
		this.value = val;
		System.out.println("this is valuenode" + val);
	}

}

