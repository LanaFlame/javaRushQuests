package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

        try (   FileInputStream inputStream = new FileInputStream(name1);
                FileOutputStream outputStream = new FileOutputStream(name1);
                FileInputStream inputStream1 = new FileInputStream(name2)) {
                while (inputStream1.available() > 0) {
                    arrayOutputStream.write(inputStream1.read());
                }

                while (inputStream.available() > 0) {
                    arrayOutputStream.write(inputStream.read());
                }

                arrayOutputStream.writeTo(outputStream);
        }
    }
}
