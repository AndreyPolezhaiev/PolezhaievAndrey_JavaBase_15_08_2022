package com.hillel.polezhaiev.lessons.homework4;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        int amountOfLi = 860;

        int voinLi = 13;
        int luchnikLi = 24;
        int vershnikLi = 46;

        int powerLi = voinLi * amountOfLi + luchnikLi * amountOfLi + vershnikLi * amountOfLi;
        System.out.println("Power of Li dynasty = " + powerLi + ";");

        //////////////////////////////////////
        double amountOfMin = amountOfLi * 1.5;

        double voinMin = 9;
        double luchnikMin = 35;
        double vershnikMin = 12;

        double powerMin = voinMin * amountOfMin + luchnikMin * amountOfMin + vershnikMin * amountOfMin;
        System.out.println("Power of Min dynasty = " + (int)powerMin + ";");

    }
}
