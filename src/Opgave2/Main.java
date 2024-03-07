package Opgave2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Cafe kakaoBaren = new Cafe();

        kakaoBaren.loadMenuData();

        for (String coffeeMenu : kakaoBaren.coffeeMenu) {
            System.out.println(coffeeMenu);
        }
    }

}
