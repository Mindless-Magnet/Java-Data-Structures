import java.util.*;            
//MUHAMMED SHAJAHAN       AM.EN.U4AIE21144
class Q2 {    
    class node{  
        int data;  
        node previous;  
        node next;  
   
        public node(int data) {  
            this.data= data;  
        }  
    }  
    node head=null;
    node tail = null;  
      
    public void add(int data) {  
        
        node newNode = new node(data);  
   
         
        if(head == null) {  
            head = tail = newNode;              
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
           
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    } 
    public void insert_start(int data) {
		node newNode = new node(data);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		return;
	} 

    public void insert_end(int data) {
		node newNode = new node(data);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		return;
	}
    public void insertBetween(int data, int index){

        node newNode = new node(data);

        if(head == null){

        System.out.println("Not found");

        }

        if (index == 0){
        insert_start(data);
        return;

        }
        node currentNode = head;
        int count = 0;
        while(currentNode.next!=null){
        if(count == index){

        break;

        }

        count=count+1;
        currentNode = currentNode.next;

        }

        if (index == count+1){
        insert_start(data);
        return;
        }

        else {
        currentNode.previous.next = newNode;
        newNode.previous = currentNode.previous;
        newNode.next = currentNode;

        currentNode.previous = newNode;
        }
        return;

        }
    
    public node delete_start() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		node temp = head;
		if(head == tail) {
			tail = null;
		} 
		else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		return temp;
	}
    
    public node delete_end() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		node temp = tail;
		if(head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		return temp;
        
	}

    public void searchNode(int value) {  
        int i = 1;  
        int flag = 0;   
        node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            
            if(current.data == value) {  
                flag = 1;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag==1)  
             System.out.println("Node is present in the list at the position : " + i);  
        else  
             System.out.println("Node is not present in the list");  
    }  
 
    private boolean isEmpty() {
        return false;
    }

    public void delete_Between(int index){

        if(head == null){

            System.out.println("List is empty!");
        }
        node currentNode = head;

        int count = 0;
        while(currentNode.next != null){
        if(count == index){
        break;

        }
        currentNode = currentNode.next;
        count+=1;
        if (currentNode.next!=null){

        currentNode.next.previous = currentNode.previous;
        } 

        else {

        delete_start();
        }
        if (currentNode.previous!=null){

        currentNode.previous.next = currentNode.next;
        } 
        else 
        {
        delete_start();
        } 
        return;
        }
    }
       
    
    public void print_list() {  
        node current = head;  
        if(head == null) {  
            System.out.println(" empty");  
            return;  
        }   
        while(current != null) {    
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
    public static void main(String[] args) {  
        Q2 list = new Q2();  

        System.out.println( " ");
        System.out.print( "doubly linked list : ");
        list.add(45);  
        list.add(54);  
        list.add(31);  
        list.add(65);  
        list.add(81); 
        list.add(90); 
        list.print_list(); 
        System.out.println( " ");
        System.out.print( "Insertion at start : ");
        list.insert_start(70);  
        list.print_list();  
        System.out.println( " ");
        System.out.print( "Insertion at end : ");
        list.insert_end(9);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Insertion in between : ");
        list.insertBetween(51,2) ;
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion at start: ");
        list.delete_start();
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion at end: ");
        list.delete_end();
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion in between: ");
        list.delete_Between(3);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Searching  : ");
        list.searchNode(81); 
    }  
}