package com.eliseew.dima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playOneMusic(2);

        System.out.println(musicPlayer.music_1.getSong());

        System.out.println(musicPlayer.getVolume());
        context.close();

    }
}