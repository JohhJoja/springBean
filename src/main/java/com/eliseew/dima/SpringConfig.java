package com.eliseew.dima;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan("com.eliseew.dima")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    public ClassicalMusic classicalMusic(){
        return ClassicalMusic.getClassicalMusic();
    }
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    public PopMusic popMusic(){
        return new PopMusic();
    }

    public MusicPlayer musicPlayer (){
        return new MusicPlayer();
    }


}
