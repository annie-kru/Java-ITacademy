package com.itacademy.javacore.lesson19.task02;

public class Main {
    public static void main(String[] args){
        Flyable bird = new Bird("Crow", 10.00);
        bird.takeOff();
        bird.fly();
        bird.land();

        Flyable plane = new Airplane("Boeing", "737-MAX", 1234, 300.00);
        plane.takeOff();
        plane.fly();
        plane.land();

        Flyable drone = new Drone("DJI-203", "John Smith");
        drone.takeOff();
        drone.fly();
        drone.land();
    }
}
