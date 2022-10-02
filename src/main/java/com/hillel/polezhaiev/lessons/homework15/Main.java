package com.hillel.polezhaiev.lessons.homework15;

public class Main {
    public static void main(String[] args) {

        Androids androids[] = {
                new Androids("Mi 11 Lite"),
                new Androids("Redmi note 10")
        };

        iPhones iphones[] = {
                new iPhones("iPhone 10"),
                new iPhones("iPhone 12")
        };

        System.out.println();
        for (int i = 0; i < androids.length; i++) {
            androids[i].call();
            androids[i].sms();
            androids[i].internet();
            androids[i].sayLinux();

            if (i != iphones.length - 1){
                System.out.println("------------------------------------------------------------------------------------------");

            }else {
                System.out.println();

            }
        }

        System.out.println("==========================================================================================");
        System.out.println();

        for (int i = 0; i < iphones.length; i++) {
            iphones[i].call();
            iphones[i].sms();
            iphones[i].internet();
            iphones[i].sayIOS();

            if (i != iphones.length - 1){
                System.out.println("------------------------------------------------------------------------------------------");

            }else if(i == iphones.length - 1){
                break;

            }else {
                System.out.println();

            }
        }

    }
}
