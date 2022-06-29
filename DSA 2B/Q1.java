import java.util.*;  
class Q1InfixtoPostfix
{  
char a[]=new char[100];  
int top=-1;  

     void push(char c)  
{  
try  
{  
a[++top]= c;  
}  
catch(StringIndexOutOfBoundsException e)  
{  
System.out.println("Overflow!");  
System.exit(0);  
}  
}  

char pop()  
{  
return a[top--];  
}  

boolean isEmpty()  
{  
return (top==-1)?true:false;  
}  

char peek()  
{  
return a[top];  
}  
       
static Q1InfixtoPostfix ob = new Q1InfixtoPostfix();         
public static void main(String args[])  
{  

Scanner sc=new Scanner(System.in); 
  
System.out.print("Enter the Infix expression: ");  
String infix = sc.nextLine();  
  
System.out.println("Postfix expression: " + toPostfix(infix));  
}  
static String toPostfix(String infix)  
{  
char symbol;  

String postfix = "";

for(int i=0;i<infix.length();++i)  
{  
symbol = infix.charAt(i);  

if (Character.isLetter(symbol))  
postfix = postfix + symbol;  

else if (symbol=='(')  
{  
ob.push(symbol);  
}  
else if (symbol==')')    
{  
while (ob.peek() != '(')  
{  
postfix = postfix + ob.pop();  
}  
ob.pop();          
}  
else  
{  
while (!ob.isEmpty() && !(ob.peek()=='(') && prec(symbol) <= prec(ob.peek()))  
postfix = postfix + ob.pop();  
ob.push(symbol);  
}  
}  
while (!ob.isEmpty())  
postfix = postfix + ob.pop();  
return postfix;  
}  
static int prec(char x)  
{  
if (x == '+' || x == '-')  
return 1;  
if (x == '*' || x == '/' || x == '%')  
return 2;  
return 0;  
}  
}