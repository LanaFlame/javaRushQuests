package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        try {
            Path path1 = Path.of(scanner.nextLine());
            while (Files.isRegularFile(path1) || (Files.isDirectory(path1))) {
                if (Files.isRegularFile(path1)) {
                    System.out.println(path1 + THIS_IS_FILE);
                } else if (Files.isDirectory(path1)) {
                    System.out.println(path1 + THIS_IS_DIR);
                }
                path1 = Path.of(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

