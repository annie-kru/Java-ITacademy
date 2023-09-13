package com.itacademy.javacore.lesson18.task01;

public class Main {
    public static void main(String[] args){
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();

        cat.sound();
        dog.sound();
        cow.sound();
    }
}
