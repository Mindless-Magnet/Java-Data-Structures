import java.util.*;

public class Q3Postfix_Evaluation
{
    
    static int Evaluate(String exp)
    {
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            
            
            if(Character.isDigit(c))
            stack.push(c - '0');
            
            
            else
            {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int f;
                
                switch(c)
                {
                    case '+':
                    stack.push(n2+n1);
                    break;
                    
                    case '-':
                    stack.push(n2- n1);
                    break;
                    
                    case '/':
                    stack.push(n2/n1);
                    break;
                    
                    case '*':
                    stack.push(n2*n1);
                    break;

                    case '^':
                    long l = Math.round(Math.pow(n2,n1));
                    f=(int)l;                    
                    stack.push(f);
                    break;
            }
            }
        }
        return stack.pop();
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression : ");
        String str=sc.next();
        System.out.print("The evaluvated postfix is : "+Evaluate(str));
        sc.close();
    }
}

