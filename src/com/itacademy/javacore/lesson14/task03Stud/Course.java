package com.itacademy.javacore.lesson14.task03Stud;

import java.util.ArrayList;
import java.util.List;

public class Course {

    public static List<Student> students;

    public Course(){
        students = new ArrayList<Student>(10);
    }

    public boolean addStudent(Student student){
        return students.add(student);
    }

    public List<Student> bestMarks(){
        List<Student> result = new ArrayList<>();

        for (Student student: students) {
            int[] grade = student.getAcademicPerformance();
            if(isHigherOrEqualTo9(grade)) {
                result.add(student);
            }
        }
        return result;
    }

    private boolean isHigherOrEqualTo9(int[] grade) {
        for(int i = 0; i < grade.length; i++) {
            if(grade[i] < 9) {
                return false;
            }
        }
        return true;
    }
}
