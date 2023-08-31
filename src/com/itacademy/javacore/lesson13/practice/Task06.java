package com.itacademy.javacore.lesson13.practice;

public class Task06 {
    public static void main(String[] args) {

        int fk;

        int n = 20;
        int from = -30;
        int to = 60;
        int step = (to - from) / n;
        int k = from;


        double a = 3 * Math.pow(10, 3);
        double b = 6 * Math.pow(10, 4);
        double m = 4.0;

        double t1;
        t1 = Math.sqrt(a + b + m);
        double t2;
        t2 = m * (Math.sqrt(a + b));
        double t3;
        t3 = Math.sqrt(a * b * m);
        double t4;
        t4 = m * (Math.sqrt(a * b));

        System.out.println("------------------------------------------");
        System.out.printf("|\t%2s\t|\t%2s\t|\n", "k", "f(k)");
        System.out.println("------------------------------------------");
        int count = 0;

        for (int i = 1; i <= n; i++){
            fk = (int)(Math.pow(k, 3) - 25 * Math.pow(k, 2) + 50 * k + 1000);

            if ((fk > t1 && fk < t2) || (fk > t3 && fk < t4)) {
                System.out.printf("|\t%4d\t|\t%4d\t|\n", k, fk);
            } else{
                count++;
            }

            k = k + step;
        }

        System.out.println("Количество остальных значений: " + count);
    }
}
