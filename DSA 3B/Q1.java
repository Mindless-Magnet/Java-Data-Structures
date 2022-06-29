import java.util.*;
class Q1
{

    int factorial(int n)
    {
        if(n<1)
        return 1;
        else
        return (n*factorial(n-1)); 
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f = sc.nextInt();
        Q1 ob = new Q1();
        System.out.println("Factorial of the number ="+ob.factorial(f));
        sc.close();
    }
}