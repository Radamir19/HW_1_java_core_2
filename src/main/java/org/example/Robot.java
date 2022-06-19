package org.example;

//I made a public class Robot

public class Robot implements Actions{
    private String name;
    private int distance;
    private int verticalJump;

    public Robot(String name, int distance, int verticalJump) {
        this.name = name;
        this.distance = distance;
        this.verticalJump = verticalJump;
    }

    public Robot() {

    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping");
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
        System.out.println("Robot is running");
    }
}
