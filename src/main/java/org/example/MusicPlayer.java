package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class MusicPlayer {


//    @Autowired
//    @Qualifier("classicalMusic")
    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rock") Music music1, @Qualifier("classical") Music music2) {
        this.rockMusic = music1;
        this.classicalMusic = music2;

    }

    public List<String> playMusic(MusicEnum musicEnum){
        switch (musicEnum){
            case ROCK:
                return rockMusic.playMusic();
            case CLASSICAL:
                return classicalMusic.playMusic();
            default:
                return Collections.emptyList();
        }
    }
}
