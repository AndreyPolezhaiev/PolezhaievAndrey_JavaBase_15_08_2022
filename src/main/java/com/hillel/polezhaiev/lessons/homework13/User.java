package com.hillel.polezhaiev.lessons.homework13;

public class User {
    private String name;
    private int day;
    private int month;
    private int year;
    private String email;
    private String phone;
    private int age;

    public String getName(String name) {
        this.name = name;
        return this.name;
    }

    public int getDay(int day) {
        this.day = day;
        return this.day;
    }

    public int getMonth(int month) {
        this.month = month;
        return this.month;
    }

    public int getYear(int year) {
        this.year = year;
        return this.year;
    }

    public String getEmail(String email) {
        this.email = email;
        return this.email;
    }

    public String getPhone(String phone) {
        this.phone = phone;
        return this.phone;
    }

    protected String surname;
    protected int weight;
    protected String press;
    protected int steps;

    public User(String name, String surname, int day, int month, int year, String email, String phone, int weight, String press, int steps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.press = press;
        this.steps = steps;
    }

    public int getAge() {
        age = 2020 - this.year;
        return age;
    }

    protected void printAccountInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Birthday: " + this.day + "." + this.month + "." + this.year);
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Weight: " + this.weight);
        System.out.println("Pressure: " + this.press);
        System.out.println("Amount of steps: " + this.steps);
    }

}
