package com.company;

public class Parrot extends Bird implements Flier{
    private String food;
    private String biome;
    private int lifeSpan;
    Parrot(String food, String biome, int lifeSpan){
    this.biome = biome;
    this.food = food;
    this.lifeSpan = lifeSpan;
}
    public void setFood(String food) {
        this.food = food;
    }

    public void setBiome(String biome) {
        this.biome = biome;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getFood() {
        return food;
    }

    public String getBiome() {
        return biome;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
    public String printCharacteristics(){
        System.out.println("I am a " + getClass().getSimpleName() + ". I like to eat " + getFood() + ". I live in a " + getBiome() + ". I can live to be about "+ getLifeSpan() +" years long.");
    return "";}

    @Override
    public void fly() {
        System.out.println("I am a "+ getClass().getSimpleName() + ". I fly using colorful wings.");
    }
}
