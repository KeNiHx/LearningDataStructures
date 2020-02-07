package com.company.DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedList {
    public static void main (String [] args) {
        //assigned  employees to variables
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJohns);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);


        Iterator iter = list.iterator();
        System.out.println("HEAD ->");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        //add to the end add or add last
        list.add(billEnd);
        iter = list.iterator();
        System.out.println("HEAD ->");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        //remove the first node
        list.removeFirst();
        iter = list.iterator();
        System.out.println("HEAD ->");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        //"removeLast" removes the last node, "remove" removes the first item in the list
        list.removeLast();
        iter = list.iterator();
        System.out.println("HEAD ->");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");


//        for(Employee employee: list){
//            System.out.println(employee);
//        }
    }
}
