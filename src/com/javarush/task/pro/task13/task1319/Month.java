package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.Arrays;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    private static final Month[] array = Month.values();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getWinterMonths()));
        System.out.println(Arrays.toString(getSpringMonths()));
        System.out.println(Arrays.toString(getSummerMonths()));
        System.out.println(Arrays.toString(getAutumnMonths()));

    }

    public static Month[] getWinterMonths() {
        Month[] winMouths = new Month[] {array[11], array[0], array[1]};
        return winMouths;
    }

    public static Month[] getSpringMonths() {
        Month[] sprMouths = new Month[] {array[2], array[3], array[4]};
        return sprMouths;
    }

    public static Month[] getSummerMonths() {
        Month[] sumMouths = new Month[]{array[5], array[6], array[7]};
        return sumMouths;
    }

    public static Month[] getAutumnMonths() {
        Month[] autMouths = new Month[]{array[8], array[9], array[10]};
        return autMouths;
    }
}
