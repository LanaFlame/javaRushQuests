package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int j = 0;
        String[] temp_arr = new String[array.length];
        for (String s : array) {
            if (s != null) {
                temp_arr[j] = s;
                j++;
            }
        }
        System.arraycopy(temp_arr, 0, array, 0, array.length);
    }
}
