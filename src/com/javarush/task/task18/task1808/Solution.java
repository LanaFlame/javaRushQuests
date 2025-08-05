package com.javarush.task.task18.task1808;

import java.io.*;

/*
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        try (FileInputStream inputStream = new FileInputStream(file1);
             FileOutputStream outputStream = new FileOutputStream(file2);
             FileOutputStream outputStream2 = new FileOutputStream(file3);
        ) {
            int halfLength = (inputStream.available() +1) / 2;
            int currentByte = 0;
            while (inputStream.available() > 0) {
                if (currentByte < halfLength) {
                    outputStream.write(inputStream.read());
                } else {
                    outputStream2.write(inputStream.read());
                }
                currentByte++;
            }

        }
    }
}
