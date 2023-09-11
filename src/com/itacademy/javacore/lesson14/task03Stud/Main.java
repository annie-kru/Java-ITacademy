package com.itacademy.javacore.lesson14.task03Stud;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course programmingFirst = new Course();

        programmingFirst.addStudent(new Student("Doe1", "John", 1, new int[] {5,5,6,7,8}));
        programmingFirst.addStudent(new Student("Doe2", "John", 1, new int[] {4,6,6,7,8}));
        programmingFirst.addStudent(new Student("Doe3", "John", 2, new int[] {9,9,10,9,10}));
        programmingFirst.addStudent(new Student("Doe4", "John", 3, new int[] {7,7,6,7,8}));
        programmingFirst.addStudent(new Student("Doe5", "John", 1, new int[] {10,10,9,9,9}));
        programmingFirst.addStudent(new Student("Doe6", "John", 1, new int[] {9,9,9,9,9}));
        programmingFirst.addStudent(new Student("Doe7", "John", 2, new int[] {8,8,8,8,8}));
        programmingFirst.addStudent(new Student("Doe8", "John", 1, new int[] {7,7,6,7,7}));
        programmingFirst.addStudent(new Student("Doe9", "John", 1, new int[] {5,9,6,7,9}));
        programmingFirst.addStudent(new Student("Doe10", "John", 3, new int[] {8,8,8,7,9}));

        System.out.println("Best students:");

        List<Student> bestStudents = programmingFirst.bestMarks();
        print(bestStudents);




    }


    public static void print(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Last name: " + students.get(i).getLastName() +
                    " , Group number: " + students.get(i).getGroupNumber());
        }
    }
}
