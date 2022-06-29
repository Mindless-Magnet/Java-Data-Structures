import java.util.*;

public class Q2BalancedParantheses {

    static boolean Balance(String e)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < e.length(); i++)
        {
            char x = e.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;

            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;

            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }

        
        return (stack.isEmpty());
    }

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression : ");
        String n=sc.nextLine();
        
        if (Balance(n))
            System.out.println("Balance ");
        else
            System.out.println("Not Balance ");

        sc.close();
    }
}
