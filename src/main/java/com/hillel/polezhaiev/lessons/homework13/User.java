package com.hillel.polezhaiev.lessons.homework13;
public class User {
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phone;

    protected String surname;
    protected double weight;
    protected String press;
    protected int steps;

    private int age;

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public String getPress() {
        return press;
    }

    public int getSteps() {
        return steps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public User(String name, String surname, int day, int month, int year, String email, String phone, double weight, String press, int steps) {
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

          StringBuilder builder = new StringBuilder();
          String data = (builder.append("Name: ").append(this.name).append("\n")
                                .append("Surname: ").append(this.surname).append("\n")
                                .append("Birthday: ").append(this.day + "." + this.month + "." + this.year).append("\n")
                                .append("Age: ").append(getAge()).append("\n")
                                .append("Email: ").append(this.email).append("\n")
                                .append("Phone: ").append(this.phone).append("\n")
                                .append("Weight: ").append(this.weight).append("\n")
                                .append("Pressure: ").append(this.press).append("\n")
                                .append("Amount of steps: ").append(this.steps).append("\n")).toString();
          System.out.println(data);

//        System.out.println("Name: " + this.name);
//        System.out.println("Surname: " + this.surname);
//        System.out.println("Birthday: " + this.day + "." + this.month + "." + this.year);
//        System.out.println("Age: " + getAge());
//        System.out.println("Email: " + this.email);
//        System.out.println("Phone: " + this.phone);
//        System.out.println("Weight: " + this.weight);
//        System.out.println("Pressure: " + this.press);
//        System.out.println("Amount of steps: " + this.steps);
    }

}
