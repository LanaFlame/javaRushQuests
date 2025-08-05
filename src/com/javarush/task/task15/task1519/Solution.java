package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readerValue;
        while (!(readerValue = reader.readLine()).equals("exit")) {
            try {
                if (readerValue.contains(".")) {
                    print(Double.parseDouble(readerValue));
                } else if (Integer.parseInt(readerValue) > 0 && Integer.parseInt(readerValue) < 128) {
                    print(Short.parseShort(readerValue));
                } else if (Integer.parseInt(readerValue) <= 0 || Integer.parseInt(readerValue) >= 128) {
                    print(Integer.parseInt(readerValue));
                } else {
                    print(readerValue);
                }
            } catch (Exception e) {
                print(readerValue);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
