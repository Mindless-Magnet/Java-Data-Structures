
import java.util.*;
class Q4 {

    int sum(int num) {
        if (num != 0)
            return num + sum(num - 1);
        else
            return num;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        Q4 ob=new Q4();
        int sum=ob.sum(n);
        System.out.println("Sum = " + sum);
        sc.close();
    }


}