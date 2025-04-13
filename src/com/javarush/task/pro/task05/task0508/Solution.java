package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        System.out.println("mehhhhhhhh");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}
