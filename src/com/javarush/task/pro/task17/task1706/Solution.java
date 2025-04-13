package com.javarush.task.pro.task17.task1706;

/* 
Хищники vs Травоядные
*/

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        if (animal instanceof Cow || animal instanceof Elephant) {
            String herbivore = "Любит траву";
            System.out.println(herbivore);
        }
        if (animal instanceof Lion || animal instanceof Wolf) {
            String predator = "Любит мясо";
            System.out.println(predator);
        }

        //напишите тут ваш код
    }
}
