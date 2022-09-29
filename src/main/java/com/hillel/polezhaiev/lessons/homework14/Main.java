package com.hillel.polezhaiev.lessons.homework14;

public class Main {
    public static void main(String[] args) {

//        MusicStyles rockSong = new RockMusic();
//        MusicStyles classicSong = new ClassicMusic();
//        MusicStyles popSong = new PopMusic();




//        MusicStyles[] rockGroup = {
//                new RockMusic("Andrey"),
//                new RockMusic("Kirill"),
//                new RockMusic("Denis")
//        };
//
//        MusicStyles[] popGroup = {
//                new PopMusic("Jenya"),
//                new PopMusic("Fedya"),
//                new PopMusic("Danya")
//        };
//
//        MusicStyles[] classicGroup = {
//                new ClassicMusic("Katya"),
//                new ClassicMusic("Masha"),
//                new ClassicMusic("Liza")
//        };




        System.out.println();

//        for(MusicStyles kindOfMusic: rockGroup){
//                kindOfMusic.playMusic();
//        }
//        System.out.println();
//
//        for(MusicStyles kindOfMusic: popGroup){
//            kindOfMusic.playMusic();
//        }
//        System.out.println();
//
//        for(MusicStyles kindOfMusic: classicGroup){
//            kindOfMusic.playMusic();
//        }


        MusicStyles[][] HOR = {
                ////////RockMusicHor///////
                {new RockMusic("Andrey"), new RockMusic("Kirill"), new RockMusic("Denis")},

                ////////PopMusicHor///////
                {new PopMusic("Jenya"), new PopMusic("Fedya"), new PopMusic("Danya")},

                ////////ClassicMusicHor///////
                { new ClassicMusic("Katya"), new ClassicMusic("Masha"), new ClassicMusic("Liza")}
        };

        for(MusicStyles[] hor: HOR){
            for (MusicStyles musicStyles : hor) {
                musicStyles.playMusic();
            }
            System.out.println();
        }

    }
}
