package com.javarush.task.pro.task15.task1522;

import java.io.*;
import java.net.URL;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        //напишите тут ваш код
        try (InputStream stream = url.openStream()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}