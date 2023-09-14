package com.itacademy.javacore.lesson18.task04;

public class TennisPlayer extends Player{
    public TennisPlayer(String name){
        super(name, "tennis");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(getName() + " is very clever.");
    }
}
