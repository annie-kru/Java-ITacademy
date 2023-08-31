package com.itacademy.javacore.lesson13.practice;

public class Task03 {
    public static void main(String[] args){
        double x = 0.5;
        double n = 20.0;

        double result;


        double sum = 0.0;
        for (double k = 1.0; k <= n; k++) {
            double interim1;
            interim1 = Math.pow(Math.E, ((x - 1) / k));
            if (interim1 == 0) {
                throw new RuntimeException("Деление на ноль выполнить невозможно.");
            }

            double interim2;
            interim2 = Math.sin((k * x) / 2) + Math.sin((k * x - 1) / 2);
            sum = sum + (interim2 / interim1);
        }

        result = Math.sqrt(n * Math.PI) * sum;

        System.out.println("Функция равна: " + result);
    }



}
