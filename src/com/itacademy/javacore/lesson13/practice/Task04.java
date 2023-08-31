package com.itacademy.javacore.lesson13.practice;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n;

        System.out.println("Задайте желаемое количество точек: ");
        System.out.print("> ");

        n = reader();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            int x;
            int y;

            System.out.println("Введите значение x для точки " + i + " :");
            System.out.print("> ");

            x = reader();

            System.out.println("Введите значение y для точки " + i + " :");
            System.out.print("> ");

            y = reader();


            if ((y >= 0 && y <= 2 && x >= -2 && x <= 0) || (y >= -1 && y <= 0 && x >= -1 && x <= 2)){
                count++;
            }


        }
        System.out.println("Количество точек, попавших в заданную область равно " + count);
    }

    public static int reader(){
        Scanner sc = new Scanner (System.in);
        while(true) {
            if (sc.hasNextInt()){
                break;
            }
            sc.nextLine();
            System.out.println("Вы ввели не целое число");
            System.out.print("> ");
        }
         return sc.nextInt();
    }
}
