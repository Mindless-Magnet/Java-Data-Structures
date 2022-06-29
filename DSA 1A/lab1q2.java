import java.util.*;
public class lab1q2
{
    public static void main (String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Enter the array limit:");
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n;i++){
			System.out.print("Enter array value ");
		    int arr_value = in.nextInt();
			a[i]=arr_value;
	    } 
	    System.out.println("Array created is " + Arrays.toString(a));
        findMin(a);
	    in.close(); 
    }
	public static void findMin(int[] a) {
		Arrays.sort(a);
		System.out.println("The Minimun value of array is " +a[0]);   
}
}
