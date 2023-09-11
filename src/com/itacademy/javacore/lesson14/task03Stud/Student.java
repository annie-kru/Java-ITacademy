package com.itacademy.javacore.lesson14.task03Stud;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String lastName;
    private String firstName;
    private int groupNumber;
    private final static int DEFAULT_AMOUNT_OF_MARKS = 5;
    private int [] academicPerformance = new int[DEFAULT_AMOUNT_OF_MARKS];

    public Student(){}

    public Student(String lastName, String firstName, int groupNumber, int[] academicPerformance){
        this.lastName = lastName;
        this.firstName = firstName;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Arrays.equals(academicPerformance, student.academicPerformance);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(lastName, firstName, groupNumber);
        result = 31 * result + Arrays.hashCode(academicPerformance);
        return result;
    }
}
