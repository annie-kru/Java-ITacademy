package com.itacademy.javacore.lesson19.task01;

import java.util.Objects;

public class Video extends MediaFile implements Playable{
    private String quality;

    public Video (String name) {
        super(name);
    }
    public Video(String name, int durationInSec,String quality) {
        super(name, durationInSec);
        this.quality = quality;
    }
    @Override
    public void play() {
        System.out.println("\"" + getName() + " \" video is playing now.");
    }

    @Override
    public void pause() {
        System.out.println("\"" + getName() + " \" video is on pause.");
    }

    @Override
    public void stop() {
        System.out.println("\"" + getName() + " \" video was stopped.");
    }

    @Override
    public void rewind() {
        System.out.println("\"" + getName() + " \" video was rewind.");
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Video video = (Video) o;
        return Objects.equals(quality, video.quality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quality);
    }

    @Override
    public String toString() {
        return "Video{" +
                "quality='" + quality + '\'' +
                '}';
    }
}
