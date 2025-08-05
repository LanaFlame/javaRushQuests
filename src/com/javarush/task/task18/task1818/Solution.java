package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        File file1 = new File(name1);
        File file2 = new File(name2);
        File file3 = new File(name3);

        try (FileOutputStream outputStream1 = new FileOutputStream(file1);
             FileInputStream inputStream2 = new FileInputStream(file2);
             FileInputStream inputStream3 = new FileInputStream(file3);) {

            while (inputStream2.available() > 0) {
                outputStream1.write(inputStream2.read());
            }

            while (inputStream3.available() > 0) {
                outputStream1.write(inputStream3.read());
            }

        }

    }
}
