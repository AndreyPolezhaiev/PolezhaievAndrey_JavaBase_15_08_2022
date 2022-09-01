package com.hillel.polezhaiev.lessons.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of first team: ");
        String fTeam = scanner.nextLine();

        System.out.println("Enter amount of kills of every player at " + fTeam + " team");
        System.out.println();
        int firMateTeam1 = 0;
        int secMateTeam1 = 0;
        int thMateTeam1 = 0;
        int fourMateTeam1 = 0;
        int fifMateTeam1 = 0;

        System.out.print("Enter kills of first player of " + fTeam + " team: ");
        if(scanner.hasNextInt())
        {
            firMateTeam1 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of second player of " + fTeam + " team: ");
        if(scanner.hasNextInt())
        {
            secMateTeam1 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of third player of " + fTeam + " team: ");
        if(scanner.hasNextInt())
        {
            thMateTeam1 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of fourth player of " + fTeam + " team: ");
        if(scanner.hasNextInt())
        {
            fourMateTeam1 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of fifth player of " + fTeam + " team: ");
        if(scanner.hasNextInt())
        {
            fifMateTeam1 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        /////////////////////////////////////////////////////////////////////////////////

        scanner.nextLine();
        System.out.println();

        System.out.print("Enter name of second team: ");
        String sTeam = scanner.nextLine();

        System.out.println("Enter amount of kills of every player at " + sTeam + " team");
        System.out.println();
        int firMateTeam2 = 0;
        int secMateTeam2 = 0;
        int thMateTeam2 = 0;
        int fourMateTeam2 = 0;
        int fifMateTeam2 = 0;

        System.out.print("Enter kills of first player of " + sTeam + " team: ");
        if(scanner.hasNextInt())
        {
            firMateTeam2 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of second player of " + sTeam + " team: ");
        if(scanner.hasNextInt())
        {
            secMateTeam2 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of third player of " + sTeam + " team: ");
        if(scanner.hasNextInt())
        {
            thMateTeam2 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of fourth player of " + sTeam + " team: ");
        if(scanner.hasNextInt())
        {
            fourMateTeam2 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }
        ////////////////////

        System.out.print("Enter kills of fifth player of " + sTeam + " team: ");
        if(scanner.hasNextInt())
        {
            fifMateTeam2 = scanner.nextInt();
        } else {
            System.out.println("ERROR!!!");
            System.exit(0);
        }


        double resultFirstTeam = (firMateTeam1 + secMateTeam1 + thMateTeam1 + fourMateTeam1 + fifMateTeam1) / 5;
        double resultSecondTeam = (firMateTeam2 + secMateTeam2 + thMateTeam2 + fourMateTeam2 + fifMateTeam2) / 5;

        System.out.println();

        if (resultFirstTeam > resultSecondTeam) {
            System.out.println("A team " + "\"" + fTeam + "\"" + " won and got " + resultFirstTeam + " points");

        } else if(resultFirstTeam < resultSecondTeam) {
            System.out.println("A team " + "\"" + sTeam + "\"" + " won and got " + resultSecondTeam  + " points");

        } else {
            System.out.println("DRAW!!!");
        }

    }
}
