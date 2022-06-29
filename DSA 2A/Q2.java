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
 

class linkedStack
{
    protected Node top ;
    protected int size ;
 
    
    public linkedStack()
    {
        top = null;
        size = 0;
    }    
    
    public boolean isEmpty()
    {
        return top == null;
    }    
    
    public int getSize()
    {
        return size;
    }    
    
    public void push(int data)
    {
        Node nptr = new Node (data, null);
        if (top == null)
            top = nptr;
        else
        {
            nptr.setAddr(top);
            top = nptr;
        }
        size++ ;
    }    
    
    public int pop()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        Node ptr = top;
        top = ptr.getAddr();
        size-- ;
        return ptr.getData();
    }    

    public int show()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        return top.getData();
    }    
    
    public void display()
    {
        System.out.print("Stack = ");
        if (size == 0) 
        {
            System.out.print("Empty");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getAddr();
        }
        System.out.println();        
    }
}
 

public class Q2{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
           
        linkedStack linkedstack = new linkedStack();          
        char ch;     
        do 
        {
            System.out.println("Select Operation");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. show");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int x = sc.nextInt();
            switch (x) 
            {
            case 1 :
                System.out.println("Enter integer element to push");
                linkedstack.push( sc.nextInt() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = "+ linkedstack.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ linkedstack.show());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ linkedstack.isEmpty());
                break;                
            case 5 : 
                System.out.println("Size = "+ linkedstack.getSize()); 
                break;                
            case 6 : 
                System.out.println("Stack = "); 
                linkedstack.display();
                break;                        
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           
            
            linkedstack.display();            
            System.out.println("Type 'Y' to continue, Type 'N' to stop");
            ch = sc.next().charAt(0);       
 
        } while (ch == 'Y'|| ch == 'y');    
        sc.close();             
    }
}