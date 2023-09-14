package com.itacademy.javacore.lesson19.task01;

public class Main {
    public static void main(String[] args){

        Playable mp3 = new MP3("Meditation", 600, "stereo", "John Doe");
        mp3.play();
        mp3.pause();
        mp3.rewind();
        mp3.stop();

        Playable podcast = new Podcast("Night talks with John Smith", 3600, "Talks", "John Doe");
        podcast.play();
        podcast.pause();
        podcast.rewind();
        podcast.stop();

        Playable video = new Video("Titanik", 10800, "4k");
        video.play();
        video.pause();
        video.rewind();
        video.stop();
    }
}
