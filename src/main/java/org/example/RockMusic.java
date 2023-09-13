package org.example;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("rock")
public class RockMusic implements Music{

    public List<String> playMusic() {
        List<String> rockMusics = new ArrayList<>();
        rockMusics.add("You Really Got Me");
        rockMusics.add("Smell Likes Teen Spirit");
        rockMusics.add("Under Pressure");

        return rockMusics;
    }
}
