package com.company.DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    //JDK linked list to back the stack
    private LinkedList<Employee> stack;

    //constructor for linked list (doubly link list) would have to write your own linked list class if memory is an issue
    public LinkedStack(){
        stack = new LinkedList<Employee>();
    }

    //adding to the head of the list
    public void push(Employee employee){
        stack.push(employee);
    }

    //removing from the head of the list
    public Employee pop(){
        return stack.pop();
    }

    //returning the head of the list without removing the head of the linked list
    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }





}
