package com.hillel.polezhaiev.lessons.homework12;

public class Burger {

    String bun;
    String meat;
    String addMeat;
    String cheese;
    String greenery;
    String mayo;

    public Burger(String bun, String meat, String cheese, String greenery, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;

        System.out.println("You've chosen regular burger");
        System.out.println("Components of regular burger:");
        System.out.println("- " + this.bun + ";");
        System.out.println("- " + this.meat + ";");
        System.out.println("- " + this.cheese + ";");
        System.out.println("- " + this.greenery + ";");
        System.out.println("- " + this.mayo + ";");
        System.out.println();

    }

    public Burger(String bun, String meat, String cheese, String greenery){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;

        System.out.println("You've chosen dietary burger");
        System.out.println("Components of dietary burger:");
        System.out.println("- " + this.bun + ";");
        System.out.println("- " + this.meat + ";");
        System.out.println("- " + this.cheese + ";");
        System.out.println("- " + this.greenery + ";");
        System.out.println();

    }

    public Burger(String bun, String meat, String addMeat, String cheese, String greenery, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.addMeat = addMeat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;

        System.out.println("You've chosen double Meat burger");
        System.out.println("Components of double Meat burger:");
        System.out.println("- " + this.bun + ";");
        System.out.println("- " + this.meat + ";");
        System.out.println("- " + this.addMeat + ";");
        System.out.println("- " + this.cheese + ";");
        System.out.println("- " + this.greenery + ";");
        System.out.println("- " + this.mayo + ";");
        System.out.println();

    }

}
