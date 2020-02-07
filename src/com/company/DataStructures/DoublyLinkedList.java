package com.company.DataStructures;

public class DoublyLinkedList {
    public static void main (String [] args){
        //assigned  employees to variables
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        //Doubly Linked list implementation
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJohns);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());
    }

}
