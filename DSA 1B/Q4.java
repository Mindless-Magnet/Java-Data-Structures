
public class Q4 {          
    //MUHAMMED SHAJAHAN         AM.EN.U4AIE21144

	static node head;	
	static int index = 0;
	static class node{

		 int data;
		 node next;
		 
		 public node(int data) {
			 this.next = null;
			 this.data = data;
		 }

	}
	public Q4(int data) {

		head= new node(data);
		index = index + 1;
	}
	public  void Insert_Start(int data) {
		node newnode = new node(data);
		node currentnode = head;
		newnode.next = head;
		for(int i = 1;i<index;i++) {
			currentnode = currentnode.next;
		}
		currentnode.next = newnode;
		head = newnode;
		index = index + 1;
		return ;
	}
	public void Insert_End(int data) {
		node newnode = new node(data);
		node currentnode = head;
		for(int i =1;i<index;i++) {
			currentnode = currentnode.next;
		}
		currentnode.next = newnode;
		newnode.next = head;
		index += index;
		return ;
	}
	public void Insert_btw_node(int value,int data) {
		node currentnode = head;
		node newnode = new node(data);
		for(int i =1;i<index;i++) {
			if(currentnode.next.data == value) {
				node temp = currentnode.next;
				currentnode.next = newnode;
				newnode.next = temp;
				index= index+1;
				break;
			}
			else {
				currentnode = currentnode.next;
			}
		}

		return;
	}

	public void  Delete_End(int data) {
		node currentnode = head;
		for(int i =1;i<index-1;i++) {
			currentnode = currentnode.next;
		}
		currentnode.next = head;
		index= index-1;
		
		return ;
	}
	public void Delete_Start(int data) {
		node temp = head.next;
		node currentnode =head;
		for(int i =1;i<index;i++) {
			currentnode = currentnode.next;
		}
		currentnode.next = temp;
		head = temp;
		index = index-1;
		return ;
	}

	public void Delete_position(int value,int data) {
		node currentnode = head;
		for(int i =1;i<index-1;i++) {
			if(currentnode.next.data == value) {
			   currentnode.next = currentnode.next.next;
			   index = index-1;
			   break;
			}
			else {
				currentnode= currentnode.next;
			}
		}
		return;
	}
	public void print_list() {
		if (head==null){
			System.out.println("Empty");
            return;
		}
		else{
		node currentnode = head;
		for(int i =0;i<index;i++) {
			System.out.print(currentnode.data + " ");
			currentnode = currentnode.next;
		}
	}}
	public  void search(int data) {
		node currentnode = head;
		int flag = 0;
		for(int i =0;i<index;i++) {
			if(currentnode.data == data) {
				System.out.println("Element present in the linkedlist");
				flag = 1;
				break;
			}
			else {
				flag = 0;
				currentnode = currentnode.next;
			}
		}
		
	}
	public static void main(String[] args) {
		Q4 list = new Q4(5);
		list.Insert_Start(19);
        list.Insert_Start(76);
        list.Insert_Start(12);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Insertion at end : ");
        list.Insert_End(45);
        list.print_list();
        System.out.println( " ");

        list.print_list();
        System.out.println( " ");
        System.out.print( "Searching element ");
        list.search(76);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion at start : ");
        list.Delete_Start(19);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion at end : ");
        list.Delete_End(2);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion between node: ");
        list.Delete_position(50,1);
        list.print_list();
		
		
		
		
		
	}
}
