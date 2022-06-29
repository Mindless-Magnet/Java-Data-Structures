import java.util.*;
public class lab1q1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] a ={1,2,3,4,5,6,7,8,9}; //creating array
        int l=a.length;
        
        System.out.println("Enter 1. Insert at start\n 2. Insert at end \n 3. Based on index \n 4. Insert based on value");// insertion
        int x=in.nextInt();
        int f=0;
        int b[];
        
        switch(x)
        {
            case 1:
            System.out.println("Enter value to insert");
            f=in.nextInt();
            l=l+1;
            b=new int[l];
            b[0]=f;
            for(int i=1;i<l;i++)
            {
                b[i]=a[i-1];
            }
            break;

            case 2:
            System.out.println("Enter value to insert");
            f=in.nextInt();
            l=l+1;
            b=new int[l];
            b[l-1]=f;
            for(int i=0;i<l-1;i++)
            {
                b[i]=a[i];
            }
            break;

            case 3:
            System.out.println("Enter value to insert");
            f=in.nextInt();
            System.out.println("Enter index");
            int c=in.nextInt();
            l=l+1;
            b=new int[l];
            b[c-1]=f;
            for(int i=0;i<l;i++)
            {
                if(i!=c-1)
                {

                b[i]=a[i-1];
                }
            }
            break;

            case 4:
            System.out.println("Enter value to insert");
            f=in.nextInt();
            System.out.println("Enter value");
            int k=in.nextInt();
            l=l+1;
            b=new int[l];
            for(int i=0;i<l;i++)
            {
                if(a[i-1]!=k)
                {
                    b[i]=a[i-1];
                }
                else
                {
                    b[i]=f;
                }
            }
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }

        System.out.println("Enter : 1. Delete at start \n 2. Delete at end \n 3. Delete at index \n 4. Delete based on value");//deletion
        int r=in.nextInt();

        switch(r)
        {
            case 1:
            l=l-2;
            b=new int[l];
            for(int i=0;i<l;i++)
            {
                b[i]=a[i+1];
            }
            break;

            case 2:
            l=l-2;
            b=new int[l];
            for(int i=0;i<l-1;i++)
            {
                b[i]=a[i];
            }
            break;

            case 3:
            System.out.println("Enter index");
            int c=in.nextInt();
            l=l-2;
            b=new int[l];
            for(int i=0;i<l;i++)
            {
                if(i!=c-1)
                {
                b[i]=a[i-1];
                }
                else 
                {
                    b[i]=a[i];
                    i+=2;
                }
            }
            break;

            case 4:
            System.out.println("Enter value");
            int k=in.nextInt();
            l=l+1;
            b=new int[l];
            for(int i=0;i<l;i++)
            {
                if(a[i-1]!=k)
                {
                    b[i]=a[i-1];
                }
                else
                {
                    b[i]=a[i];
                    i++;
                }
            }
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
        
        for(int i=0;i<a.length;i++)// traversal
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter 1 for search by index and 2 for search by value");
        int o=in.nextInt();
        switch(o)
        {
            case 1:
            System.out.println("Enter index");
            f=in.nextInt();
            if(f>a.length||f<0)
            {
                System.out.println("index out of bounds");
            }
            else
            System.out.println("Element at index = "+a[f]);
            break;

            case 2:
            System.out.println("Enter value");
            f=in.nextInt();
            for(int i=0;i<l;i++)
            {
                if(a[i]==f)
                System.out.println("Element found");
                else
                System.out.println("Element not found");
            }
        }
        in.close();
    }
}
