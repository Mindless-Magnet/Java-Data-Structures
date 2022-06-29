import java.util.*;

class Node
{
    static int data;
    static Node addr;
 
    
    public Node()
    {
        addr = null;
        data = 0;
    }    
    
    public Node(int d,Node n)
    {
        data = d;
        addr = n;
    }    
    
    public void setAddr(Node n)
    {
        addr = n;
    }    
    
    public void setData(int d)
    {
        data = d;
    }    
    
    public Node getAddr()
    {
        return addr;
    }    
    
    public int getData()
    {
        return data;
    }
}
 

class linkedQueue
{
    protected Node front, back;
    public int n;
 
    
    public linkedQueue()
    {
        front = null;
        back = null;
        n = 0;
    }    
    
    public boolean isEmpty()
    {
        return front == null;
    }    
    
    public int getSize()
    {
        return n;
    }    
    
    public void insert(int data)
    {
        Node nptr = new Node(data, null);
        if (back == null)
        {
            front = nptr;
            back = nptr;
        }
        else
        {
            back.setAddr(nptr);
            back = back.getAddr();
        }
        n++ ;
    }    
    
    public int remove()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getAddr();        
        if (front == null)
            back = null;
        n-- ;        
        return ptr.getData();
    }    
    
    public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }    
    
    public void display()
    {
        System.out.print("\nQueue = ");
        if (n == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != back.getAddr() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getAddr();
        }
        System.out.println();        
    }
}
 

public class Q4
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        
        linkedQueue linkq = new linkedQueue();         
        char ch;        
        do
        {
            System.out.println("Select Operation");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");
            int choice = sc.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter element to insert");
                linkq.insert( sc.nextInt() );
                break;                         
            case 2 : 
                try 
                {
                    System.out.println("Removed Element = "+ linkq.remove());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ linkq.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ linkq.isEmpty());
                break;
 
            case 5 : 
                System.out.println("Size = "+ linkq.getSize());
                break;  
 
            default : 
                System.out.println("Wrong Entry");
                break;
            }                
            
            linkq.display();
 
            System.out.println("Type 'Y' to continue, Type 'N' to stop");
            ch = sc.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');          
        sc.close();                                                  
    } 
}