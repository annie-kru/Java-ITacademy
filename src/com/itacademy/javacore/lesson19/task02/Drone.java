package com.itacademy.javacore.lesson19.task02;

import java.util.Objects;

public class Drone implements Flyable{
    private String manufacturer;
    private String owner;

    public Drone(String manufacturer, String owner){
        this.manufacturer = manufacturer;
        this.owner = owner;
    }
    @Override
    public void takeOff() {
        System.out.println(getManufacturer() + " drone owned by " + getOwner() + " took off.");
    }

    @Override
    public void land() {
        System.out.println(getManufacturer() + " drone owned by " + getOwner() + " has landed.");
    }

    @Override
    public void fly() {
        System.out.println(getManufacturer() + " drone owned by " + getOwner() + " is flying.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drone drone = (Drone) o;
        return Objects.equals(manufacturer, drone.manufacturer) && Objects.equals(owner, drone.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, owner);
    }

    @Override
    public String toString() {
        return "Drone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
