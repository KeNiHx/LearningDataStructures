package com.company.DataStructures;

public class LLStacks {
    public static void main(String [] args){
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        //add items to the stack
        LinkedStack stack = new LinkedStack();
        stack.push(janeJohns);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        //print the stack
        stack.printStack();

        //pop items from the stack
        System.out.println("Popped: " + stack.pop());

        //peeks in the updated stack
        System.out.println(stack.peek());

    }
}
