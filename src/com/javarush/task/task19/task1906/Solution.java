package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        try (FileReader inputStream = new FileReader(file1);
        FileWriter outputStream = new FileWriter(file2)) {
            int counter = 1;
            int data;
            while ((data = inputStream.read()) != -1) {
                if (counter%2==0) {
                    outputStream.write(data);
                }
                counter++;
            }
        }
    }
}
