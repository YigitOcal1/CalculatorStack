
public class Stacklinked<T>
{

	private class Node
	{
	T item;
	Node next;	
	}
	
	private Node top = null;
	
	public void push(T item)
	{
		Node oldtop = top;
	  top = new Node();
	  top.item = item;
	    top.next = oldtop;
	}
	
	public T pop()
	{
	
			T item = top.item;
	  top = top.next;
	  return item;
	}

	public boolean isEmpty()
	{ return top == null;

	}

	public void showStack() {
		
		if(top==null) {
			System.out.println("[]");
	      	}		
				
	else {
		Node a=top;
		
		System.out.print("[");
		
		while(a!=null) {
			
			System.out.print(a.item);
			System.out.print(",");
		     a=a.next;}
			System.out.print("]");
		
		
		}
	}	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	


