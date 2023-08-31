package com.itacademy.javacore.lesson13.practice;

public class Task05 {
    public static void main(String[] args) {

        int n = 5;
        double y;


        double a = 1.0;
        double x = -2.0 * a;
        double dx = a / 5.0;



        System.out.println("------------------------------------------");
        System.out.printf("|\t%4s\t|\t%10s\t|\n", "x", "y");
        System.out.println("------------------------------------------");

        for (int i = 1; i <= n; i++) {

            if (x <= 0.0) {
                y = (a / 2) * (Math.pow(Math.E, (x / a)) + Math.pow(Math.E, (-x / a)));
            } else {
                double interim;
                interim = (Math.pow(x, 2) + 4 * (Math.pow(a, 2)));

                if (interim == 0) {
                    throw new RuntimeException("Деление на ноль невозможно.");
                }

                y = (4 * Math.pow(a, 3)) / interim;
            }

            System.out.printf("|\t%4.2f\t|\t%4.6f\t|\n", x, y);

            x =  x + dx;
        }
    }
}
