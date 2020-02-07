package com.company.DataStructures;

public class SinglyLinkLists {
    public static void main(String [] args){
        //assigned  employees to variables
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        //Singly LinkedList implementation
        EmployeeLinkedList list = new EmployeeLinkedList();

        //check that the list is empty
        System.out.println(list.isEmpty());
        list.addToFront(janeJohns);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        //Get the size of the linked list
        System.out.println(list.getSize());

        //print the linked list
        list.printList();

        //remove the first item in the list
        list.removeFromFront();
        System.out.println(list.getSize());

    }
}
