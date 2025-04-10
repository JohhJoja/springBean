package com.eliseew.dima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class MusicPlayer {
    @Autowired
    private List<Music> music = new ArrayList<>();
    @Autowired
    @Qualifier("classicalMusic")
    Music music_1;
    @Value("${musicPlayer.volume}")
    private String volume;

    //IoC
//    @Autowired
//    public MusicPlayer(List<Music> music
////            , @Qualifier("rockMusic") Music m1
//    ) {
//        this.music = music;
////        this.music_1 = m1;
//    }
    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setVolume(String volume) {this.volume = volume;}
    public String getVolume() {
        return volume;
    }
    public void playMusic(){
        for (Music value : music) {
            System.out.println("Playing: " + value.getSong());
        }
    }
    public void playOneMusic(int i){System.out.println(music.get(i).getSong());}
}
