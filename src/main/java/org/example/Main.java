package org.example;

import java.util.Random;

public abstract class Main {

    public static void main(String[] args) {
        /*Person person = new Person();
        Cat cat = new Cat();
        Robot robot = new Robot();
        person.jump();
        person.run();
        cat.jump();
        cat.run();
        robot.jump();
        robot.run();*/
    }

    Random random = new Random();
    Actions[] actions = new Actions[3];

    int distance = random.nextInt(1000);
    int height = random.nextInt(25);

    //actions [0] = new Person("Nilolay",distance, height);
}
