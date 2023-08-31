package com.itacademy.javacore.lesson13.practice;

public class Task08 {
    public static void main(String[] args) {

        double x = 0.1;
        double step = 0.1;

        double y;

        System.out.println("----------------------");
        System.out.printf("|\t%2s\t|\t%4s\t|\n", "x", "y");
        System.out.println("----------------------");

        while (true) {
            y = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4.0;
            if (y < 0 || x > 10){
                break;
            }
            System.out.printf("|\t%2.1f\t|\t%2.3f\t|\n", x, y);
            x = x + step;
        }
    }
}
