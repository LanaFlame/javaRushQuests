package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        int[] array = new int[256];

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                array[fileInputStream.read()] += 1;
            }
            int minValue = Integer.MAX_VALUE;
            for (int element : array) {
                if (minValue > element && element > 0) minValue = element;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if(array[i] == minValue) arrayList.add(i);
            }
            StringBuilder builder = new StringBuilder();
            for (Integer result : arrayList) {
                builder.append(result);
                builder.append(" ");
            }
            String mmm = builder.toString();
            System.out.println(mmm.trim());
        }
    }
}
