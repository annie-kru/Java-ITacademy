package com.itacademy.javacore.lesson13.practice;

public class Task07 {
    public static void main(String[] args) {

        int n = 5;
        double x = 30.0;
        double xStep = 1.0;

        int m = 2;
        double z = 10.0;
        double zStep = 2.0;

        double y;

        System.out.println("------------------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\t%4s\t|\n", "x", "z", "y");
        System.out.println("------------------------------------------");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                double temp1;
                temp1 = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2));
                double temp2;
                temp2 = Math.pow(x, 2) - Math.pow(z, 2) + 3.2;
                if (temp2 <= 0) {
                    throw new RuntimeException("Неверное значение в делителе");
                }
                y = (temp1 * Math.log(z)) + (Math.abs(Math.log(z)) / Math.sqrt(temp2));


                System.out.printf("|\t%2.1f\t|\t%2.1f\t|\t%2.3f\t|\n", x, z, y);
                z = z + zStep;
            }

            x = x + xStep;
        }
    }
}
