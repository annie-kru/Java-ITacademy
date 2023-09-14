package com.itacademy.javacore.lesson18.task04;

import java.util.Objects;

public class Player {
    private String name;
    private String sportType;

    public Player(String name, String sportType){
        this.name = name;
        this.sportType = sportType;
    }

    public void play(){
        System.out.print(name + " plays " + sportType + ". ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(sportType, player.sportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sportType);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
