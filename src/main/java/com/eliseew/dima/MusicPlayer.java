package com.eliseew.dima;

public class MusicPlayer {
    private Music music;
    private String volume;
    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){System.out.println("Playing: "+music.getSong());}
}
