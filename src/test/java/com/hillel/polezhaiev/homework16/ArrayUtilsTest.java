package com.hillel.polezhaiev.homework16;

import com.hillel.polezhaiev.lessons.homework16.main.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    double []array;
    int [][] matrix;

    @Test
    public void test1(){
        double value = ArrayUtils.getMiddleValueOfArray(array = new double[]{-3.0, 5.0, 7.8, 9.0});
        Assertions.assertEquals(4.7, value);
    }

    @Test
    public void test2(){
        double value = ArrayUtils.getMiddleValueOfArray(array = new double[]{});
        Assertions.assertEquals(0, value);
    }

    @Test
    public void test3(){
        double value = ArrayUtils.getMiddleValueOfArray(array = new double[]{0});
        Assertions.assertEquals(0, value);
    }

    @Test
    public void test4(){
        boolean value = ArrayUtils.squareMatrix(matrix = new int[][] {{3}, {2}});
        Assertions.assertEquals(false, value);
    }

    @Test
    public void test5(){
        boolean value = ArrayUtils.squareMatrix(matrix = new int[][] {{},{}});
        Assertions.assertEquals(false, value);
    }

    @Test
    public void test6(){
        boolean value = ArrayUtils.squareMatrix(matrix = new int[][] {{3, 2}, {2, 4}});
        Assertions.assertEquals(true, value);
    }

    @Test
    public void test7(){
        boolean value = ArrayUtils.squareMatrix(matrix = new int[][] {{3, 2}, {2, 4}, {5, 9}});
        Assertions.assertEquals(false, value);
    }

}
