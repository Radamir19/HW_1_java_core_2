package org.example;

//I made a public class Person

public class Person implements Actions{
    private String name;
    private int distance;
    private int verticalJump;

    public Person(String name, int distance, int verticalJump) {
        this.name = name;
        this.distance = distance;
        this.verticalJump = verticalJump;
    }

    @Override
    public void jump() {
        System.out.println("Person " + name + " is jumping "+getVerticalJump());
    }

    @Override
    public void run() {
        System.out.println("Person " + name +" is running "+getDistance());
    }

    public int getDistance() {
        return distance;
    }

    public int getVerticalJump() {
        return verticalJump;
    }
}
