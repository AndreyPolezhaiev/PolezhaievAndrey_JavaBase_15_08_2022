package com.hillel.polezhaiev.lessons.homework14;

public class PopMusic extends MusicStyles {

    String person;

    public PopMusic(String person){
        this.person = person;
    }

    @Override
    void playMusic() {
        System.out.println(person + " is singing POP music");
    }
}
