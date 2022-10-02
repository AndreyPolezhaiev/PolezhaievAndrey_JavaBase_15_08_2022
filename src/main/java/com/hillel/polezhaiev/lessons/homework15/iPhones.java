package com.hillel.polezhaiev.lessons.homework15;

public class iPhones implements Smartphones, iOS{
    private final String phone;

    public iPhones(String phone){
        this.phone = phone;
    }

    @Override
    public void call() {
        System.out.println(phone + " is telling: Make a call to talk to someone.");
    }

    @Override
    public void sms() {
        System.out.println(phone + " is telling: Try to use sms if you don't have internet.");
    }

    @Override
    public void internet() {
        System.out.println(phone + " is telling: Internet is the best thing that makes our life better.");
    }

    @Override
    public void sayIOS() {
        System.out.println(phone + " is telling: Hello, I am iOS.");
    }
}
