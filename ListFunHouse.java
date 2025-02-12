package Class.LinkedListParams;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Vento-Jones

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
    // @param ListNode list to print out every single node of.
    public static void print(ListNode list)
   {
	   while(list != null){
		   System.out.print(list.getValue() + " ");
		   list = list.getNext();
	   }
   }
	
	//this method will return the number of nodes present in list
    // @param ListNode list to count the number of nodes of.
	public static int nodeCount(ListNode list)
	{
		int count = 0;
		while(list != null) {
			count++;
			list = list.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
    // @param ListNode list to repeat the first node of twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode prev = new ListNode(list.getValue(), list.getNext());
		list.setNext(prev);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
    // @param ListNode list to repeat the final node of twice.
	public static void doubleLast(ListNode list)
	{
		while(list.getNext() != null){
            list = list.getNext();
        }
        list.setNext(new ListNode(list.getValue(), null));
	}
		
	//method skipEveryOther will remove every other node
    // @param ListNode list to skip every other node off, removing the respective nodes.
		public static void skipEveryOther(ListNode list)
		{
            ListNode current = list;
			while(current!=null && current.getNext() != null){
                current.setNext(current.getNext().getNext());
                current = current.getNext();
            }
        }

	//this method will set the value of every xth node in the list
    // @param ListNode list to set the nodes of in given amount.
    // @param int x to determine how many nodes to skip through to get to the node to set. (For every node in x nodes...)
    // @param Comparable value is what every xth node will be set to
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		ListNode current = list;
		int count=1;
		while(current != null) {
            if(count%x==0){
                current.setValue(value);
            }
			current = current.getNext();
			count++;
		}
		
	}	

	//this method will remove every xth node in the list
    // @param ListNode list to remove the nodes of in given amount.
    // @param int x to determine how many nodes to skip through to get to the node to remove/skip over. (For every node in x nodes...)
	public static void removeXthNode(ListNode list, int x)
	{
		ListNode current = list;
        ListNode prev = null;
        int count = 1;
        while(current!=null){
            if(count%x==0){
                prev.setNext(current.getNext());
            }
            else{
                prev = current;
            }
            current = current.getNext();
            count++;
        }
	}	
}
