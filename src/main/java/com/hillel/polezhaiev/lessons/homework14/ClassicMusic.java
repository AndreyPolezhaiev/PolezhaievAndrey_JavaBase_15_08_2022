package com.hillel.polezhaiev.lessons.homework14;

public class ClassicMusic extends MusicStyles {

    String person;

    public ClassicMusic(String person) {
        this.person = person;
    }

    @Override
    void playMusic() {
        System.out.println(person + " is playing the violin");
    }
}
