package com.itacademy.javacore.lesson20.task01;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {

    public int compare (Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }

}
