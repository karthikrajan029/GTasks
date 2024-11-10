import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackUsingArrayList {
    List<Integer> stack=new ArrayList<>();

    public void push(Integer x)
    {
        stack.add(x);
        System.out.println("Given element successfully pushed");
        System.out.println("Stack contains " +stack);
    }

    public void pop()
    {
        int size=stack.size();
        if(!isEmpty()) {
            stack.remove(size - 1);
            System.out.println("Top element in the stack successfully removed");
            System.out.println("Stack contains " + stack);
        }
    }

    public Boolean isEmpty()
    {
        if(stack.isEmpty())
        {
           System.out.println("Stack is empty");
            return true;
        }
        System.out.println("Stack is not empty");
        return false;
    }

    public static void main(String args[])
    {
        StackUsingArrayList stack1=new StackUsingArrayList();
        System.out.println("Enter the element to push into the stack");
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        Scanner sc=new Scanner(System.in);
        Integer x;
        System.out.println("Enter any integer element to add to the stack");
        x=sc.nextInt();
        stack1.push(x);
        stack1.pop();
        stack1.isEmpty();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.isEmpty();

    }
}
