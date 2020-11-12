package ru.Example;

public class Animal {
    private int age;
    private int speed;
    private int weight;

    public Animal(int age, int speed, int weight) {
        this.age=age;
        this.speed=speed;
        this.weight=weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
