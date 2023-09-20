package com.itacademy.javacore.lesson20.task01;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    public int compare (Employee o1, Employee o2) {
        return (o1.getEmployeeId() - o2.getEmployeeId());
    }
}
