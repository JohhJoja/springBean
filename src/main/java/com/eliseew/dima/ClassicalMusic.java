package com.eliseew.dima;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doNIT(){
        System.out.println("INIT!!!!");
    }
    @PreDestroy
    public void DESTROY(){
        System.out.println("DESTROY!!!!");
    }
    private ClassicalMusic() {}


    public static ClassicalMusic getClassicalMusic(){
        System.out.println("FACTORY!");
        return new ClassicalMusic();
    }

    public void doMyInitM(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing destraction!");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhaspody";
    }

}
