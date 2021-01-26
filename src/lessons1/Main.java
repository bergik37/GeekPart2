package lessons1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Cat cat[]=new Cat[2];
        Human human[]=new Human[2];
        Robot robot[]=new Robot[2];

        cat[0]=new Cat("Barsik",20,15);
        cat[1]=new Cat("Xvostik",30,25);

        human[0]=new Human("Boris",10,35);
        human[1]=new Human("Oleg",15,45);

        robot[0]=new Robot("Gelezka",6,4);
        robot[1]=new Robot("R2D2",1,5);

        for (int i = 0; i < cat.length; i++) {
                cat[i].jump();
                cat[i].run();
           // System.out.println();
                human[i].jump();
                human[i].run();
            //System.out.println();
                robot[i].jump();
                robot[i].run();
        }

    }
}
