package com.hillel.polezhaiev.lessons.homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of rows");
        int M = getValue(scanner);

        System.out.println("Enter amount of columns");
        int N = getValue(scanner);

        int arr1 [][] = new int[M][N];
        int arr2 [][] = new int[N][M];

        System.out.println("First array:");

        int values = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                values++;
                arr1[i][j] = values;
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Second array:");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                arr2[i][j] = arr1[j][i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

    }

    static int getValue(Scanner scanner)
    {
        int temp = 0;
        System.out.println("Enter Integer: ");
        while(true)
        {
            if(scanner.hasNextInt())
            {
                temp = scanner.nextInt();
                if(temp <= 0)
                {
                    System.out.println("Wrong data!!!");
                    scanner.nextLine();
                    continue;
                }
                break;
            } else {
                System.out.println("Wrong data!!!");
                scanner.nextLine();
            }
        }
        return temp;
    }
}
