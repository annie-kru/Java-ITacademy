package com.itacademy.javacore.lesson18.task04;

public class Main {
    public static void main(String[] args){
        BasketballPlayer player1 = new BasketballPlayer("John");
        FootballPlayer player2 = new FootballPlayer("Peter");
        TennisPlayer player3 = new TennisPlayer("Kate");

        player1.play();
        player2.play();
        player3.play();
    }
}
