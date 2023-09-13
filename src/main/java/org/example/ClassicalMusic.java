package org.example;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classical")
public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> playMusic() {
        List<String> classicalMusic = new ArrayList<>();
        classicalMusic.add("Fur Elise");
        classicalMusic.add("The Four Seasons");
        classicalMusic.add("Symphony No 5");

        return classicalMusic;
    }
}