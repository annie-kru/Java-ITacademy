package com.itacademy.javacore.lesson19.task02;

import java.util.Objects;

public class Airplane implements Flyable{
    private String manufacturer;
    private String model;
    private int flightNumber;
    private double speedInKilometersPerHour;

    public Airplane(String manufacturer, String model, int flightNumber, double speedInKilometersPerHour){
        this.manufacturer = manufacturer;
        this.model = model;
        this.flightNumber = flightNumber;
        this.speedInKilometersPerHour = speedInKilometersPerHour;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane " + getManufacturer() + " "+ getModel() + " flight number " + getFlightNumber() + " took off.");
    }

    @Override
    public void land() {
        System.out.println("Plane " + getManufacturer() + " "+ getModel() + " flight number " + getFlightNumber() + " has landed.");
    }

    @Override
    public void fly() {
        System.out.println("Plane " + getManufacturer() + " "+ getModel() + " flight number " + getFlightNumber() + " is flying.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeedInKilometersPerHour() {
        return speedInKilometersPerHour;
    }

    public void setSpeedInKilometersPerHour(double speedInKilometersPerHour) {
        this.speedInKilometersPerHour = speedInKilometersPerHour;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return flightNumber == airplane.flightNumber && Double.compare(airplane.speedInKilometersPerHour, speedInKilometersPerHour) == 0 && Objects.equals(manufacturer, airplane.manufacturer) && Objects.equals(model, airplane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, flightNumber, speedInKilometersPerHour);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", flightNumber=" + flightNumber +
                ", speedInKilometersPerHour=" + speedInKilometersPerHour +
                '}';
    }
}
