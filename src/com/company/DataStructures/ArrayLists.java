package com.company.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String [] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Johns", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //getting the second employee
        //System.out.println( "\n" + employeeList.get(1) );
        //Determine if the list is empty
        //System.out.println(employeeList.isEmpty() );
        employeeList.set(1, new Employee("John", "Adams", 4568));

        //Size of the list
        System.out.println(employeeList.size());

        //Add at a specific index
        employeeList.add(3, new Employee("John", "Doe", 4567));

        //print out each element in the employee array
        // employeeList.forEach(employee -> System.out.println(employee));

        //putting Employee list into an employee array
        //Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        //for(Employee employee : employeeArray){
        //System.out.println(employee);
        //}

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.contains(new Employee("John", "Doe", 4567)));

        //Removing items from the list
        employeeList.remove(2);

        employeeList.forEach(employee -> System.out.println(employee));




    }
}
