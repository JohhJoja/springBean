package com.eliseew.dima;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private String volume;
    //IoC
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }
    public void setMusic(List<Music> music) {
        this.music = music;
    }
    public MusicPlayer() {}

    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getVolume() {
        return volume;
    }
    public void playMusic(){
        for (Music value : music) {
            System.out.println("Playing: " + value.getSong());
        }
    }
}
