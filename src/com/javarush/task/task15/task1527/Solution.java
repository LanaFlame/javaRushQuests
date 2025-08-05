package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String obj = null;
        String[] eq = new String[1];
        String[] params = url.split("\\?");
        String paramsAfterQuestion = params[1];
        params = paramsAfterQuestion.split("&");
        StringBuilder builder = new StringBuilder();
        for (String s : params) {
            if (s.contains("=")) {
                eq = s.split("=");
                builder.append(eq[0]);
                builder.append(" ");
                if (eq[0].equals("obj")) {
                    obj = eq[1];
                }
            } else {
                builder.append(s);
                builder.append(" ");
            }
        }
        System.out.println(builder);
        if (obj != null) {
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException nfe) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
