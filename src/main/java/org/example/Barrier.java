package org.example;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    public abstract boolean move(Actions actions);

    public String getName() {
        return name;
    }
}
