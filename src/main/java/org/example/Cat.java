package org.example;

//I made a public class Cat

public class Cat implements Actions {
    private String name;
    private int distance;
    private int verticalJump;

    public Cat(String name, int distance, int verticalJump) {
        this.name = name;
        this.distance = distance;
        this.verticalJump = verticalJump;
    }

    public Cat() {

    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public int getTreadmillDistance() {
        return distance;
    }

    @Override
    public int getWallHeight() {
        return verticalJump;
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
