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
        Person person = new Person("Alex", 500, 40);
        Cat cat = new Cat("Barsik", 700, 30);
        Robot robot = new Robot("000001110", 200, 0);
        Wall wall = new Wall("Wall", 30);
        Treadmill treadmill = new Treadmill("Treadmill", 450);

        Actions[] actions = {person, cat, robot};
        Barrier[] barrier = {treadmill, wall};

        for (Actions action :
                actions) {
            for (int i = 0; i < barrier.length; i++) {
                if (!barrier[i].move(action)) {
                    break;
                }

            }
            }
        }
    }


