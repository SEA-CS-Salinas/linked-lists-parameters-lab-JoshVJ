package Class.LinkedListParams;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Vento-Jones

public class ListNode implements Linkable
{
	private Comparable listNodeValue;
	private ListNode nextListNode;

    // No-argument constructor sets List as null.
	public ListNode()
	{
		listNodeValue = null;
		nextListNode = null;
	}

    // @param value sets the current node value
    // @param holds the ListNode after this current node
	public ListNode(Comparable value, ListNode next)
	{
		listNodeValue=value;
		nextListNode=next;
	}

    // @return The current node's value
	public Comparable getValue()
	{
		return listNodeValue;
	}

    // @return nextListNode, the ListNode after this current one.
	public ListNode getNext()
	{
	   return nextListNode;
	}

    // @param value to set the current ListNode value to.
	public void setValue(Comparable value)
	{
		listNodeValue = value;
	}

    // @param ListNode to set the next ListNode to.
	public void setNext(Linkable next)
	{
		nextListNode = (ListNode)next;
	}
}
