package CollectionFramework;
import  java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek  = stack.peek();
        System.out.println(peek);
        int pop = stack.pop();

        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty);
        System.out.println(stack);
    }
}
