package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(12.2, "a");
        labels.put(12.3, "b");
        labels.put(12.4, "c");
        labels.put(12.5, "d");
        labels.put(12.6, "e");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
