package com.itacademy.javacore.lesson19.task01;

import java.util.Objects;

public abstract class MediaFile implements Playable{
    private String name;
    private int durationInSec;
    public MediaFile(String name){

    }
    public MediaFile(String name, int durationInSec){
        this.name = name;
        this.durationInSec = durationInSec;
    }


    public int getDurationInSec() {
        return durationInSec;
    }

    public void setDurationInSec(int durationInSec) {
        this.durationInSec = durationInSec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaFile mediaFile = (MediaFile) o;
        return durationInSec == mediaFile.durationInSec && Objects.equals(name, mediaFile.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, durationInSec);
    }

    @Override
    public String toString() {
        return "MediaFile{" +
                "name='" + name + '\'' +
                ", durationInSec=" + durationInSec +
                '}';
    }
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void rewind() {

    }
}
