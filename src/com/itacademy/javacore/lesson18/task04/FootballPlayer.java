package com.itacademy.javacore.lesson18.task04;

public class FootballPlayer extends Player{

    public FootballPlayer(String name){
        super(name, "football");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(getName() + " is very fast.");
    }
}
