package com.eliseew.dima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic class_m = context.getBean("classic_musicBean", ClassicalMusic.class);
        System.out.println(class_m.getSong());

        context.close();

    }
}