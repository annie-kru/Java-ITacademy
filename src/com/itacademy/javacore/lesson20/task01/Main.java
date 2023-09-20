package com.itacademy.javacore.lesson20.task01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John Smith", "B", 1000.00);
        Employee employee2 = new Employee(3, "Peter Green", "A", 500.00);
        Employee employee3 = new Employee(6, "John Doe", "B", 1100.00);
        Employee employee4 = new Employee(5, "Emma Lit", "C", 600.00);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        Collections.sort(employees);
        System.out.println(employees);

        Collections.sort(employees, new DepartmentComparator());
        System.out.println(employees);

        Collections.sort(employees, new IdComparator());
        System.out.println(employees);

        Collections.sort(employees, new NameComparator());
        System.out.println(employees);

    }
}
