import java.io.IOException;
import java.util.*;
public class lab1q3
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

        int k=0;


            for(int i=0;i<=(n/2);i++)//reversing
            {
                k=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=k;
            }

            System.out.println(Arrays.toString(a));
            sc.close();
    }
}