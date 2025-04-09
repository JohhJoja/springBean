package com.eliseew.dima;

public class ClassicalMusic implements Music{

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
