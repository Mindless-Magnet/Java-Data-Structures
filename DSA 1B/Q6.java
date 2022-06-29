//MUHAMMED SHAJAHAN AM.EN.U4AIE21144
class Q6 {
	Node head;

	
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}


	void KtoLast(int n)
	{
		int len = 0;
		Node temp = head;		
		while (temp != null) {
			temp = temp.next;
			len++;
		}		
		if (len < n)
			return;
		temp = head;	
		for (int i = 1; i < len - n + 1; i++)
			temp = temp.next;
		System.out.println("K to last element="+temp.data);
	}

	public void push(int new_data)
	{		
		Node new_node = new Node(new_data);		
		new_node.next = head;		
		head = new_node;
	}
	
	public static void main(String[] args)
	{
		Q6 llist = new Q6();
		llist.push(39);
		llist.push(2);
		llist.push(5);
		llist.push(40);

		llist.KtoLast(3);
	}
}
