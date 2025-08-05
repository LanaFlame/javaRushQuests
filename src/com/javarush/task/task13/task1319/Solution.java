package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_name = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file_name));
        String line = "";
        while (!line.equals("exit")) {
            line = reader.readLine();
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();
    }
}
