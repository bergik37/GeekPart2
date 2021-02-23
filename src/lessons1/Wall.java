package lessons1;

import java.util.Random;

public class Wall {


    private int height;

    public Wall(int height) {

        this.height = height;
    }

    public int getHeight() {

        return (int) (Math.random() *100);
    }

    public void setHeight(int height) {

        this.height = height;
    }



}
