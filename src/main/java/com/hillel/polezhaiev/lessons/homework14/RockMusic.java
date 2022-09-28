package com.hillel.polezhaiev.lessons.homework14;

public class RockMusic extends MusicStyles {

    String person;

    public RockMusic(String person) {
        this.person = person;
    }

    @Override
    void playMusic() {
        System.out.println(person + " is singing ROCK music");
    }
}
