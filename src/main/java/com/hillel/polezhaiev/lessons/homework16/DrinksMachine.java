package com.hillel.polezhaiev.lessons.homework16;

public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    WATER("Mineral water"),
    COLA("Coca Cola");

    private String drink;
    DrinksMachine (String drink){
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
