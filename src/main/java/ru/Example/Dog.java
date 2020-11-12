package ru.Example;

public class Dog extends Animal{
    public Dog(int age, int speed, int weight) {
        super(age, speed, weight);
    }

    public String getVoice(){
        return "Гав!";
    }

    public String foodType(){
        return "Кость";
    }

    public boolean canSwim(){
        return true;
    }

    public boolean canClimbTree(){
        return false;
    }
}
