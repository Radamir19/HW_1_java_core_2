package org.example;

public class Treadmill extends Barrier {
    private int length;


    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean move(Actions actions) {
        System.out.println("The treadmill " + super.getName() + " length is: "+ length);
        actions.run();

        if(getLength() <= actions.getTreadmillDistance()){
            System.out.println("Run was successful");
            return true;
        }else{
            System.out.println("Run was unsuccessful");
            return false;
        }
    }
}
