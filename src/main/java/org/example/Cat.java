package org.example;

//I made a public class Cat

public class Cat implements Actions {
    private String name;
    private int runDistance;
    private int verticalJump;

    public Cat(String name, int runDistance, int verticalJump) {
        this.name = name;
        this.runDistance = runDistance;
        this.verticalJump = verticalJump;
    }

    public Cat() {

    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return verticalJump;
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
