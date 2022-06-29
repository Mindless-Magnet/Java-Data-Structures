import java.util.*;  
class Q1 {  
    int top;   
    int n = 10;  
    int[] A = new int[n];  
       
    Q1()  
    {  
        top = -1;  
    }
    
    boolean Empty()  
    {  
        return (top < 0);  
    }

    boolean push (Scanner sc)  
    {  
        if(top == n-1)  
        {  
            System.out.println("Overflow!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter the value");  
            int val = sc.nextInt();  
            top++;  
            A[top]=val;  
            System.out.println("Element has been pushed");  
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Element has been popped");  
            return true;  
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack elements");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(A[i]);  
        }  
    }  
  
  
public static void main(String[] args) {  
    int x=0;  
    Scanner sc = new Scanner(System.in);  
    Q1 s = new Q1();  
    
    do  
    {  
        System.out.println("Select your choice");  
        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
        System.out.println("\n Enter your choice \n");        
        x = sc.nextInt();  
        switch(x)  
        {  
            case 1:  
            {   
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4:   
            {  
                System.out.println("End of program");  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Invalid Option");  
            }   
        };  
    } while(x != 4);
}  
}
