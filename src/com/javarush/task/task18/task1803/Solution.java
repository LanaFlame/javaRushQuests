package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
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
            int maxValue = 0;
            for (int element : array) {
                if (maxValue < element) maxValue = element;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if(array[i] == maxValue) arrayList.add(i);
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
