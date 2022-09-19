package com.hillel.polezhaiev.lessons.homework11;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Andrey", "Polezhaiev", "Charkiw", "385937504"));
        System.out.println(personInfo("Artem", "Orlov", "Kyiv", "640026749"));
        System.out.println(personInfo("Anton", "Pershin", "Donezk", "530254788"));
    }

    static String personInfo(String name, String surname, String city, String phoneNumber)
    {
        String info = "You can make a call to person " + name + " " + surname + " from city " + city + " by phone number " + phoneNumber;
        return info;
    }
}
