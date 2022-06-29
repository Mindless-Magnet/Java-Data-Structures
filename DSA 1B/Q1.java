public class Q1  { 
    //MUHAMMED SHAJAHAN AM.EN.U4AIE21144
    static node head;
    static int s;
    public class node{
        int now;
        node  next;
        node(int now){
            this.now=now;
            this.next = null;
        }
    }

    //insert at start
    public  void insert_start(int now){
        node newnode =  new node(now);  //(a) Creation of single linkedlist
        if (head==null){
            head= newnode;
            return;
        }
        newnode.next = head;    
        head= newnode;
    }

    //insert at end
    public  void insert_end(int now) {
        node new_node = new node(now);
       
         if (head == null) {
                head =new_node;
                return ;
            }
            
         else {
             node last = head;
             while(last.next!=null) {
                 last = last.next;
             }
             last.next = new_node;
         }	   
        
    }

    //Insert between the node
    public void insert_btw_node(int now,int btw) {
        node current = head;
        node newnode = new node(now);
        if(current == null) {
            head = newnode;
            return ;
        }
        else {
            while(current != null) {
                if(current.next.now ==btw ) {
                    node temp = current.next;
                    current.next = newnode;
                    newnode.next = temp;
                    break;
                }
                else {
                    current = current.next;
                }
            }
            return ;
        }
    }
    
    // Delete at start
    public void delete_start(int now) {
        node current = head;
        if(current == null) {
            System.out.println("Empty list !!!");
            return;
        }
        else {
            current = current.next;
            head = current;
            return ;
        }
    }

    //Delete at end
    public void delete_end(int now) {
	   
        if(head == null) {
            System.out.println("Empty list ");
            return ;
        }
        else {
            node currentnode = head;
            node second_last= currentnode;
            while(currentnode.next !=null) {
                second_last = currentnode;
                currentnode = currentnode.next;
            }
            second_last.next = null;
            return ;
        }
    }


    //Delete between node
    public void  delete_btw_node(int now,int delete) {
        node currentnode = head;
        if(head == null) {
            System.out.println("Emoty list");
            return;
        }
        else {
            while(currentnode!=null) {
                node temp = currentnode;
                if((currentnode.next).now==delete) {
                    temp.next = (currentnode.next).next;
                    break;
                }
                else {
                    currentnode = currentnode.next;
                }
            }
            return ;
        }}

    //Searching the element
    public void search(int now) {  
        node current = head;  
        int i = 1;  
        int flag = 0;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                 //Compares node to be found with each node present in the list  
                if(current.now == now) {  
                    flag = 1;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag==1)  
             System.out.println("Element searching is at the position  " + i);  
        else  
             System.out.println("Element is not present ");  
    }  
   
       
        

    // Traversal
    void print_list(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        node current=head;
        while(current!=null){
            System.out.print(current.now + " ");
            current = current.next;

        }
    }
 public static void main( String[] args) {
         Q1 list = new Q1();
         System.out.print( "Insertion at start: ");
        list.insert_start(10);
        list.insert_start(1);
        list.insert_start(6);
        list.insert_start(12);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Insertion at end : ");
        list.insert_end(45);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Insertion between node : "); 
        list.insert_btw_node(50, 10);  //Add 50 before 10
        list.print_list();
        System.out.println( " ");
        System.out.print( "Searching element :  ");
        list.search(6);
        System.out.print( "Deletion at start : ");
        list.delete_start(1);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion at end : ");
        list.delete_end(1);
        list.print_list();
        System.out.println( " ");
        System.out.print( "Deletion between node: ");
        list.delete_btw_node(41,1);
        list.print_list();

                 
        }
    }