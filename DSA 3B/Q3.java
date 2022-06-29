import java.util.*;
public class Q3
{     
public String reverseString(String str)  
{   
if(str.isEmpty())  
{  
System.out.println("String is empty.");   
return str;  
}   
else   
{  
return reverseString(str.substring(1))+str.charAt(0);  
}  
}  
public static void main(String[] args)   
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String s=sc.nextLine();  
    Q3 ob = new Q3(); 
    String rev = ob.reverseString(s);    
    System.out.println(rev);    

    sc.close();
}  
}  