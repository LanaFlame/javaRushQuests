package com.javarush.task.pro.task10.task1010;

/*
Два айфона
*/

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишите тут ваш код

    @Override
    public boolean equals(Object iphone) {

        if (iphone == null) {
            return false;
        }

        return (this.getClass() == iphone.getClass() && Objects.equals(this.color, ((Iphone) iphone).color)
                && Objects.equals(this.model, ((Iphone) iphone).model)
                && Objects.equals(this.price, ((Iphone) iphone).price));
    }

    public int hashCode() {

        return 0;
    }



    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
