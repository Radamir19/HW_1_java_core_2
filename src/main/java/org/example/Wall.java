package org.example;

public class Wall extends Barrier {
    private int height;


    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean move(Actions actions) {
        System.out.println("The wall "+ super.getName()+" height is: "+ height);
        actions.jump();

        if(getHeight() <= actions.getWallHeight()){
            System.out.println("Jump successful");

            return true;
        }else{
            System.out.println("Jump unsuccessful");

            return false;
        }
    }
}