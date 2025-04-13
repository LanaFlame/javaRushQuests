package com.javarush.task.pro.task13.task1301;
import java.util.ArrayList;
import java.util.HashSet;

/*
Оформляем возврат
*/

public class Solution {

    private String name;

    public Solution(String name) {
        this.name = name;
    }
    public static void main(String[] args) {

        ArrayList<Solution> cats = new ArrayList<>();
        Solution thomas = new Solution("Томас");
        Solution behemoth = new Solution("Бегемот");
        Solution philipp = new Solution("Филипп Маркович");
        Solution pushok = new Solution("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).name.equals("Бегемот")) {
                cats.remove(i);
                i--;
                System.out.println(cats.size());
            }
        }

    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        HashSet<String> answer = new HashSet<>();
        for (String element : strings) {
            answer.add(element);
        }
        return answer;
    }
}

