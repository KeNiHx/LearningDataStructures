package com.company.DataStructures;

public class Stacks {
    public static void main (String [] args){
        //stack using an array implementation, might be a good implementation if the size of the array is fixed
        ArrayStack stack = new ArrayStack(10);
            stack.push(new Employee("Jane", "Johns", 123));
            stack.push(new Employee("John", "Doe", 4567));
            stack.push(new Employee("Mary", "Smith", 22));
            stack.push(new Employee("Mike", "Wilson", 3245));
            stack.push(new Employee("Bill", "End", 78));

            //prints the stack
            //stack.printStack();

            //peek at the top of the stack
            System.out.println(stack.peek());

            //pop the first employee from the stack
            System.out.println("Popped:" + stack.pop());

            //checking that the popped employee is no longer there
            System.out.println(stack.peek());

    }
}
