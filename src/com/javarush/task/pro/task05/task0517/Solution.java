package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int[] subArray1;
        int[] subArray2;
        if (array.length % 2 == 0) {
            subArray1 = Arrays.copyOfRange(array, 0, array.length / 2);
            subArray2 = Arrays.copyOfRange(array, array.length / 2, array.length);
        } else {
            subArray1 = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
            subArray2 = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
        }
        result[0] = subArray1;
        result[1] = subArray2;

        System.out.println(Arrays.deepToString(result));
    }
}
