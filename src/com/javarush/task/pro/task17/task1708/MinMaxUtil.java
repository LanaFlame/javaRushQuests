package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static int min(int a, int b, int c) {
        int r = Math.min(a, b);
        return Math.min(r, c);
    }
    public static int min(int a, int b, int c, int d) {
        int r = Math.min(a, b);
        int s = Math.min(r, c);
        return Math.min(s, d);
    }
    public static int min(int a, int b, int c, int d, int e) {
        int r = Math.min(a, b);
        int s = Math.min(r, c);
        int l = Math.min(s, d);
        return Math.min(l, e);
    }
    
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c) {
        int r = Math.max(a, b);
        return Math.max(r, c);
    }
    public static int max(int a, int b, int c, int d) {
        int r = Math.max(a, b);
        int s = Math.max(r, c);
        return Math.max(s, d);
    }
    public static int max(int a, int b, int c, int d, int e) {
        int r = Math.max(a, b);
        int s = Math.max(r, c);
        int l = Math.max(s, d);
        return Math.max(l, e);
    }
    }
