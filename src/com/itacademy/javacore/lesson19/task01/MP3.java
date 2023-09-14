package com.itacademy.javacore.lesson19.task01;

import java.util.Objects;

public class MP3 extends MediaFile implements Playable{
    private String audioChannel;
    private String author;

    public MP3 (String name) {
        super(name);
    }
    public MP3(String name, int durationInSec,String audioChannel, String author) {
        super(name, durationInSec);
        this.audioChannel = audioChannel;
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println(getName() + ".mp3 is playing now.");
    }

    @Override
    public void pause() {
        System.out.println(getName() + ".mp3 is on pause.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + ".mp3 was stopped.");
    }

    @Override
    public void rewind() {
        System.out.println(getName() + ".mp3 was rewind.");
    }

    public String getAudioChannel() {
        return audioChannel;
    }

    public void setAudioChannel(String audioChannel) {
        this.audioChannel = audioChannel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MP3 mp3 = (MP3) o;
        return Objects.equals(audioChannel, mp3.audioChannel) && Objects.equals(author, mp3.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),audioChannel , author);
    }

    @Override
    public String toString() {
        return "MP3{" +
                "mediaChannel='" + audioChannel + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


}
