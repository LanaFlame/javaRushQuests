package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String value = reader.readLine();
            if (value.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            } else if (value.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else if (value.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else {
                thePlanet = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // implement step #5 here - реализуйте задание №5 тут
    }
}
