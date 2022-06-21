package org.example;

//I made a public class Person

public class Person implements Actions{
    private String name;
    private int runDistance;
    private int verticalJump;

    public Person(String name, int runDistance, int verticalJump) {
        this.name = name;
        this.runDistance = runDistance;
        this.verticalJump = verticalJump;
    }

    @Override
    public void jump() {
        System.out.println("Person " + name + " is jumping "+getJumpHeight());
    }

    @Override
    public void run() {
        System.out.println("Person " + name +" is running "+getRunDistance());
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return verticalJump;
    }
}
