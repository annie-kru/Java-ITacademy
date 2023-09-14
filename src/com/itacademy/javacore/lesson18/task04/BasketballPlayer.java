package com.itacademy.javacore.lesson18.task04;

public class BasketballPlayer extends Player{
    public BasketballPlayer(String name){
        super(name, "basketball");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(getName() + " is very high.");
    }
}
