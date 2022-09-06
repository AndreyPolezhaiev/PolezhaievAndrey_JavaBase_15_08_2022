package com.hillel.polezhaiev.lessons.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 11);
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 10: ");

        while (true) {
            if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

                if (number == lottery) {
                    System.out.println("You entered a true value!");
                    break;
                } else {
                    i++;
                    if(i == 3)
                    {
                        System.out.println("All requests were used!!!");
                        break;
                    }
                    System.out.println();
                    System.out.println("Try again!");
                    System.out.print("Enter a value: ");
                }
            } else {
                System.out.println();
                System.out.println("FALSE data!!!");
                System.out.print("Enter again: ");
                scanner.nextLine();
            }
        }
    }
}
