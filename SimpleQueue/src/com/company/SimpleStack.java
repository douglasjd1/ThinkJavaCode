package com.company;
import java.util.Stack;

public class SimpleStack
{
    public static void main(String[] args)
    {
        SimpleStack simpleStack = new SimpleStack();
        simpleStack.run();
    }
    void run()
    {
        Stack<String> myStack = new Stack<>();

        myStack.add("One");
        myStack.add("Two");
        myStack.add("Three");
        myStack.add("Four");
        myStack.add("Five");

        System.out.println(myStack);

        System.out.println(myStack.pop());

        System.out.println(myStack);

        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());

    }
}
