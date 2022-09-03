package com.hillel.polezhaiev.lessons.homework7;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int number = 1;
        for (int i = 1; i < 100 + counter + 1; i++) {

            if ((i / 10 == 4) || (i / 10 == 9) ||
                    (i % 10 == 4) || (i % 10 == 9) ||
                    (i % 100 == 4) || (i % 100 == 9) ||
                    (i % 100 / 10 == 4 || i % 100 / 10 == 9))
            {
                counter++;
                continue;
            } else {
                System.out.println("SHATL " + number + " - " + i);
            }
            number++;
        }
    }
}
