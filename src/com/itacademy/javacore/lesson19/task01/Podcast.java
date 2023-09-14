package com.itacademy.javacore.lesson19.task01;

import java.util.Objects;

public class Podcast extends MediaFile implements Playable{

    private String podcastChannel;
    private String host;

    public Podcast (String name) {
        super(name);
    }
    public Podcast(String name, int durationInSec, String podcastChannel, String host) {
        super(name, durationInSec);
        this.podcastChannel = podcastChannel;
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("\"" + getName() + " \" podcast is playing now.");
    }

    @Override
    public void pause() {
        System.out.println("\"" + getName() + " \" podcast is on pause.");
    }

    @Override
    public void stop() {
        System.out.println("\"" + getName() + " \" podcast was stopped.");
    }

    @Override
    public void rewind() {
        System.out.println("\"" + getName() + " \" podcast was rewind.");
    }
    public String getPodcastChannel() {
        return podcastChannel;
    }

    public void setPodcastChannel(String podcastChannel) {
        this.podcastChannel = podcastChannel;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Podcast podcast = (Podcast) o;
        return Objects.equals(podcastChannel, podcast.podcastChannel) && Objects.equals(host, podcast.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), podcastChannel, host);
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "podcastChannel='" + podcastChannel + '\'' +
                ", host='" + host + '\'' +
                '}';
    }


}
