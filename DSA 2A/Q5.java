import java.util.*;

public class Q5
 {
    public static <T> void reverseStack(Stack<T> stack) {
        if (stack.isEmpty()) {
            return;
        }
        T bottom = popBottom(stack);
        reverseStack(stack);
        stack.push(bottom);
    }

    private static <T> T popBottom(Stack<T> stack) {
        T top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            T bottom = popBottom(stack);
            stack.push(top);
            return bottom;
        }
    }

    private static <T> void printStack(Stack<T> stack) {
        Iterator<T> iterator = stack.iterator();
        while (iterator.hasNext()) {
            T t = (T) iterator.next();
            System.out.print(t + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack elements before reverse: ");
        printStack(stack);
        Q5 reversal = new Q5();
        Q5.reverseStack(stack);
        System.out.println("Stack after reverse: ");
        printStack(stack);

        Stack<String> stack2 = new Stack<>(); 
        stack2.push("a");
        stack2.push("b");
        stack2.push("c");
        stack2.push("d");
        stack2.push("e");
        stack2.push("f");
        stack2.push("g");
        System.out.println("Stack elements before reverse: ");
        printStack(stack2);
        Q5.reverseStack(stack2);
        System.out.println("Stack before reverse: ");
        printStack(stack2);
    }
}