package com.hillel.polezhaiev.lessons.homework16;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static <scanner> void main(String[] args) {

        DrinksMachine [] arr = DrinksMachine.values();
        DrinksMachine [] finish = new DrinksMachine[arr.length];
        MethodOfCooking method = new MethodOfCooking();
        Scanner scanner = new Scanner(System.in);

        DrinksMachine drinks = null;

        System.out.println();
        System.out.println("DRINK'S SHOP");
        System.out.println("If you want more than one drink, write \"YES\",\nor \"NO\" to order only one.");
        String choice = scanner.nextLine().toUpperCase();

        while(true) {
            if(choice.equals("NO") == true || choice.equals("YES") == true){
                break;

            } else if(choice.equals("\n") == true) {
                choice = scanner.nextLine().toUpperCase();

            } else {
                System.out.println("Wrong data, try again!!!");
                System.out.println("If you want more than one drink, write \"YES\",\nor \"NO\" to order only one");
                choice = scanner.nextLine().toUpperCase();
            }
        }

        int mistake = 0;
        int sum = 0;
        while(true){

            if(choice.equalsIgnoreCase("NO")){
                System.out.println("Enter a drink from the list below:");
                System.out.println("COFFEE, TEA, LEMONADE, MOJITO, WATER, COLA");
                String value = scanner.nextLine().toUpperCase();

                for (DrinksMachine drink: arr) {
                    if(value.equals(drink.toString())){
                        drinks = drink;
                        mistake++;
                        break;
                    }
                }

                if (drinks == null)
                {
                    System.out.println("Wrong data, try again!!!");

                } else {
                    System.out.println();
                    System.out.println("You've ordered 1 drink");
                    System.out.println("Your drink is " + drinks.getDrink() + ";");
                    System.out.println();
                    break;
                }

            } else if(choice.equalsIgnoreCase("YES")){
                drinks = null;
                System.out.println("Enter a drink from the list below or \"BUY\" to buy:");
                System.out.println("COFFEE, TEA, LEMONADE, MOJITO, WATER, COLA");
                String value = scanner.nextLine().toUpperCase();

                for (int i = 0; i < arr.length; i++) {
                    if(value.equals(arr[i].toString())){
                        drinks = arr[i];
                        finish[i] = drinks;
                        mistake++;
                        break;
                    }
                }

                 if (value.equalsIgnoreCase("BUY")){
                     if(mistake == 0){
                         System.out.println("You haven't ordered anything\nStart from starting to order some drink");
                         break;
                     }
                    System.out.println("Your drinks are:");
                     for (int i = 0; i < finish.length; i++) {
                         if(finish[i] == null) {
                             continue;
                         }
                         System.out.print(finish[i].getDrink() + "; ");
                     }
                     System.out.println();
                     System.out.println();

                    int count = 0;
                    for (int i = 0; i < finish.length; i++) {
                        if(finish[i] == null)
                        {
                            continue;
                        } else {
                            count++;

                            if(finish[i].equals(DrinksMachine.COFFEE)){
                                sum += Drinks.COFFEE_PRIСE;

                            } else if(finish[i].equals(DrinksMachine.COLA)){
                                sum += Drinks.COCA_COLA_PRIСE;

                            } else if(finish[i].equals(DrinksMachine.MOJITO)){
                                sum += Drinks.MOJITO_PRIСE;

                            }else if(finish[i].equals(DrinksMachine.TEA)){
                                sum += Drinks.TEA_PRIСE;

                            }else if(finish[i].equals(DrinksMachine.LEMONADE)){
                                sum += Drinks.LEMONADE_PRIСE;

                            }else if (finish[i].equals(DrinksMachine.WATER)){
                                sum += Drinks.MINERAL_WATER_PRIСE;

                            }

                        }

                        if(finish[i].equals(DrinksMachine.TEA)){
                            method.tea();
                        }

                        if(finish[i].equals(DrinksMachine.COFFEE)){
                            method.coffee();
                        }

                        if(finish[i].equals(DrinksMachine.COLA)){
                            method.cocaCola();
                        }

                        if(finish[i].equals(DrinksMachine.LEMONADE)){
                            method.lemonade();
                        }

                        if(finish[i].equals(DrinksMachine.WATER)){
                            method.mineralWater();
                        }

                        if(finish[i].equals(DrinksMachine.MOJITO)){
                            method.mojito();
                        }

                    }

                    if(count == 1){
                        System.out.println("You've ordered " + count + " drink");

                    } else{
                        System.out.println();
                        System.out.println("You've ordered " + count + " drinks");

                    }

                    break;
                }else if (drinks == null) {
                    System.out.println("Wrong data, try again!!!");

                }

            }

        }


        if (choice.equalsIgnoreCase("NO")){
            switch(drinks){

                case COLA: {
                    method.cocaCola();
                    sum+=Drinks.COCA_COLA_PRIСE;
                    break;
                }
                case MOJITO: {
                    method.mojito();
                    sum+=Drinks.MOJITO_PRIСE;
                    break;
                }
                case LEMONADE: {
                    method.lemonade();
                    sum+=Drinks.COCA_COLA_PRIСE;
                    break;
                }
                case WATER: {
                    method.mineralWater();
                    sum+=Drinks.MINERAL_WATER_PRIСE;
                    break;
                }
                case COFFEE: {
                    method.coffee();
                    sum+=Drinks.COFFEE_PRIСE;
                    break;
                }
                case TEA: {
                    method.tea();
                    sum+=Drinks.TEA_PRIСE;
                    break;
                }
            }
        }

        if(mistake > 0){
            System.out.println("You must pay " + sum + " dollars");
        }

    }
}