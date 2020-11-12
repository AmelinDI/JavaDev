package ru.Example;

public class Cat extends Animal{
    public Cat(int age, int speed, int weight) {
        super(age, speed, weight);
    }

    public String getVoice(){
        return "Мяяяяяяу!";
    }

    public String foodType(){
        return "Молоко";
    }

    public boolean canSwim(){
        return false;
    }

    public boolean canClimbTree(){
        return true;
    }
}
