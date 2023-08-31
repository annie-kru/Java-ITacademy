package com.itacademy.javacore.lesson13.practice;

public class Task01 {
    public static void main(String[] args){

        double x = 0.5;
        double interim1;
        double interim2;
        double result;


        interim1 = Math.pow(Math.E, (2.2 * x));
        interim2 = x + (2.0 / 3.0);

        if (interim1 < 0 || interim2 == 0) {
            throw new RuntimeException("При данном значении x функцию рассчитать невозможно.");
        }

        result = Math.sqrt(interim1) - Math.abs(Math.sin((Math.PI * x) / (x + (2.0/3.0)))) + 1.7;


        System.out.println("Функция равна " + result);
    }
}
