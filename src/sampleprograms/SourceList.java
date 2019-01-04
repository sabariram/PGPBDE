package sampleprograms;

class MyLinkedList{
	
	Node head;
	class Node
	{
		int data;
		Node next;
		public Node(int d) 
		{
			this.data = d; 
			this.next = null; 
		}
	}
		
	public void moveLastElementToHead()
	{
		Node current = head;
		if (head == null)
		{
			return;
		}
		
		while(current.next.next != null)
		{
			current = current.next;
		}
		current.next.next = head;
		head = current.next;
		current.next = null;
	}
	public void push(int data)
   	 {
		Node current = head;
		if (head == null)
		{
			head = new Node(data);
			return;
		}
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = new Node(data);
	}
	public void printList()
   	{
		Node current = head;
		if (head == null)
		{
			System.out.println("Linked List is Empty");
		}
		
		while (current != null)
		{
			System.out.printf("%d ",current.data);
			current = current.next;
		}
        		
   	}

}

public class SourceList {
    public static void main(String[] args){
    	
    	int nos[] = {7,5,45,7,4};
    	MyLinkedList list1 = new MyLinkedList();
    	
    	for (int i = 0; i < 5; i ++)
    	{
    		list1.push(nos[i]);
    		
    	}
    	list1.printList();
		list1.moveLastElementToHead();
		list1.printList();
    	
    }
}