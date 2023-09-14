package com.itacademy.javacore.lesson19.task02;

import java.util.Objects;

public class Bird implements Flyable{

    private String birdBreed;
    private double speedInKilometersPerHour;

    public Bird(String birdBreed, double speedInKilometersPerHour){
        this.birdBreed = birdBreed;
        this.speedInKilometersPerHour = speedInKilometersPerHour;
    }


    @Override
    public void takeOff() {
        System.out.println(getBirdBreed() + " bird took off.");
    }

    @Override
    public void land() {
        System.out.println(getBirdBreed() + " bird has landed.");
    }

    @Override
    public void fly() {
        System.out.println(getBirdBreed() + " bird is flying.");
    }

    public String getBirdBreed() {
        return birdBreed;
    }

    public void setBirdBreed(String birdBreed) {
        this.birdBreed = birdBreed;
    }

    public double getSpeedInKilometersPerHour() {
        return speedInKilometersPerHour;
    }

    public void setSpeedInKilometersPerHour(double speedInKilometersPerHour) {
        this.speedInKilometersPerHour = speedInKilometersPerHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Double.compare(bird.speedInKilometersPerHour, speedInKilometersPerHour) == 0 && Objects.equals(birdBreed, bird.birdBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birdBreed, speedInKilometersPerHour);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdType='" + birdBreed + '\'' +
                ", speedInKilometersPerHour=" + speedInKilometersPerHour +
                '}';
    }
}
