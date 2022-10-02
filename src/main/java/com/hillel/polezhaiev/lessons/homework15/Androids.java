package com.hillel.polezhaiev.lessons.homework15;

public class Androids implements Smartphones, LinuxOS{
    private final String phone;
    public Androids(String phone){
        this.phone = phone;
    }

    @Override
    public void call() {
        System.out.println(phone + " is telling: If you are far, call someone to tell HI.");
    }

    @Override
    public void sms() {
        System.out.println(phone + " is telling: This thing doesn't need internet.");
    }

    @Override
    public void internet() {
        System.out.println(phone + " is telling: Speaking with your friends in different parts of the world.");
    }

    @Override
    public void sayLinux() {
        System.out.println(phone + " is telling: Hello, I know Linux.");
    }
}
