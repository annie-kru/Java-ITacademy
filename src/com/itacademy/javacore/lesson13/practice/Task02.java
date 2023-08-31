package com.itacademy.javacore.lesson13.practice;

public class Task02 {
    public static void main(String[] args) {
        double a = 0.5;
        double b = 1.0;
        int n = 10;

        print(a, b, n);


    }

    public static double formula(double x) {
        double interim1;
        double interim2;
        double result;


        interim1 = Math.pow(Math.E, (2.2 * x));
        interim2 = x + (2.0 / 3.0);

        if (interim1 < 0 || interim2 == 0) {
            throw new RuntimeException("При данном значении x функцию рассчитать невозможно.");
        }

        result = Math.sqrt(interim1) - Math.abs(Math.sin((Math.PI * x) / (x + (2.0/3.0)))) + 1.7;

        return result;
    }

    public static void print(double a, double b, int n) {

        double step = (b - a) / 10;


        System.out.println("------------------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\t%10s\t|\n", "No", "x", "y");
        System.out.println("------------------------------------------");

        double y;
        int count = 1;
        for (double x = a; x <= b; x = x +step) {
            y = formula(x);
            System.out.printf("|\t%4d\t|\t%4.2f\t|\t%4.6f\t|\n", count, x, y);
            count++;
        }
        System.out.println("------------------------------------------");
    }
}
