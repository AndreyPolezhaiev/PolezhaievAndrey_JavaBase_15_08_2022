package com.hillel.polezhaiev.lessons.homework16.main;

public class ArrayUtils {

    public static double getMiddleValueOfArray(double[] array){

        if(array == null || array.length == 0){
            return 0;
        }

        double sum = 0.0;
        double amount = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            amount++;
        }


        if(sum == 1.0){
            return sum;
        }

        double middleValue = sum / amount;
        return middleValue;
    }

    public static boolean squareMatrix(int[][]matrix){

        int sum = 0;

        if(matrix.length == 0){
            return true;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i == j){
                    sum++;
                }
            }
        }

        if(sum == 1){
            return false;
        }

        if(sum % 2 == 0){
            return true;

        }
        return false;
    }

}
