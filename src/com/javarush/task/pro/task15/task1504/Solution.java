package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        try (var input = Files.newInputStream(Paths.get(scanner.nextLine()));
             var output = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            while (input.available()>0) {
                int byte1 = input.read();
                if (input.available() < 2) {
                    output.write(byte1);
                    return;
                }
                int byte2 = input.read();
                output.write(byte2);
                output.write(byte1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

