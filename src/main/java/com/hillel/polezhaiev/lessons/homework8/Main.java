package com.hillel.polezhaiev.lessons.homework8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 18;
        int max = 40;
        int sum1 = 0;
        int sum2 = 0;
        double result1 = 0;
        double result2 = 0;
        Scanner scanner = new Scanner(System.in);

        int [] team1 = new int[25];
        int [] team2 = new int[25];

        //initialisation of team1
        for (int i = 0; i < team1.length; i++) {
            team1[i] = min + (int)(Math.random() * (max  - min + 1));
            System.out.print(team1[i] + " ");
        }

        //Middle age of team1
        for (int i = 0; i < team1.length; i++) {
            sum1 += team1[i];
        }
        result1 = sum1 / team1.length;

        System.out.println();

        //initialisation of team2
        for (int i = 0; i < team2.length; i++) {
            team2[i] = min + (int)(Math.random() * (max  - min + 1));
            System.out.print(team2[i] + " ");
        }

        //Middle age of team2
        for (int i = 0; i < team2.length; i++) {
            sum2 += team2[i];
        }
        result2 = sum2 / team2.length;

        System.out.println();
        System.out.println();
        System.out.println("Middle age of team1: " + (int)result1);
        System.out.println("Middle age of team2: " + (int)result2);
    }
}
