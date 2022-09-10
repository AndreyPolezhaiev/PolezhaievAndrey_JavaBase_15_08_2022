package com.hillel.polezhaiev.lessons.homework9;

public class Main {
    public static void main(String[] args) {

        int size = 7;
        int [] owner = new int[size];
        int [] player = new int[size];

        //Initialisation of owner's numbers
        for (int i = 0; i < owner.length; i++) {
            owner[i] = (int)(Math.random() * 10);
            System.out.print(owner[i] + " ");
        }

        System.out.println();

        //Initialisation of player's numbers
        for (int i = 0; i < player.length; i++) {
            player[i] = (int)(Math.random() * 10);
            System.out.print(player[i] + " ");
        }

        System.out.println();
        System.out.println();

        //Sort of owner
        for (int i = 0; i < owner.length - 1; i++) {
            for (int j = 0; j < owner.length - 1 - i; j++) {

                if(owner[j] > owner[j + 1])
                {
                    int temp = owner[j];
                    owner[j] = owner[j + 1];
                    owner[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < owner.length; i++) {
            System.out.print(owner[i] + " ");
        }

        System.out.println();

        //Sort of player
        for (int i = 0; i < player.length - 1; i++) {
            for (int j = 0; j < player.length - 1 - i; j++) {

                if(player[j] > player[j + 1])
                {
                    int temp = player[j];
                    player[j] = player[j + 1];
                    player[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < player.length; i++) {
            System.out.print(player[i] + " ");
        }

        System.out.println();

        int counter = 0;
        for (int i = 0; i < size; i++) {

            if(owner[i] == player[i])
            {
                counter++;
            }

        }
        System.out.println("Amount of same elements at both arrays: " + counter);

    }
}
