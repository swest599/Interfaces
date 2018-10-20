package com.company;

public class FruitBat implements  Flier{
    private String food;
    private String sleepStyle;
    private String home;

    FruitBat (String food, String sleepStyle, String home){
        this.food = food;
        this.home =  home;
        this.sleepStyle = sleepStyle;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSleepStyle(String sleepStyle) {
        this.sleepStyle = sleepStyle;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getFood() {
        return food;
    }

    public String getSleepStyle() {
        return sleepStyle;
    }

    public String getHome() {
        return home;
    }
    public  String printChracteristics(){
        System.out.println("I am a "+ getClass().getSimpleName() +". I like to eat " + getFood() +". I am " +getSleepStyle()+ ". I live in a " +getHome());
    return "";}

    @Override
    public void fly() {
        System.out.println("I am a "+getClass().getSimpleName()+ ". I fly using leathery wings.");
    }
}
