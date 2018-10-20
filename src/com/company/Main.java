package com.company;

public class Main {

    public static void main(String[] args) {
        Bird jay = new Bird();
        jay.Ancestors();
        Parrot parrot = new Parrot("leaves", "forest", 19);
        parrot.printCharacteristics();
        parrot.fly();
        FruitBat fruitBat = new FruitBat("fruit", "nocturnal", "cave");
        fruitBat.printChracteristics();
        fruitBat.fly();
    }
}
