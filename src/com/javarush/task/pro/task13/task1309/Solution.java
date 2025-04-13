package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
       grades.put("1", 2.4);
       grades.put("2", 2.5);
       grades.put("3", 2.6);
       grades.put("4", 2.7);
       grades.put("5", 2.8);
    }
}
