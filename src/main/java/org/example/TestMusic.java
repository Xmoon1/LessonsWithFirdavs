package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(MusicEnum.ROCK));


        musicPlayer.playMusic(MusicEnum.ROCK).forEach(System.out::println);

        context.close();
    }


}
