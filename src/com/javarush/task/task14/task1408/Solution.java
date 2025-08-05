package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            //напишите тут ваш код
            Hen hen = null;
            switch (country) {
                case "Russia":
                    hen = new RussianHen();
                    break;
                case "Ukraine":
                    hen = new UkrainianHen();
                    break;
                case "Moldova":
                    hen = new MoldovanHen();
                    break;
                case "Belarus":
                    hen = new BelarusianHen();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + country);
            }
            return hen;
        }
    }


}
