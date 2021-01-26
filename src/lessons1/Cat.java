package lessons1;

import java.util.SortedMap;

public class Cat {

    //Wall wall;

    private String name;
    private int maxJump;
    private int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public String getName() {
        return name;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public boolean run(){

        if (RunTrack.getDistance()<getMaxRun()){
            System.out.println(name+" Смог пробежать дорожку длинной "+Wall.getHeight());
            return true;
        }
        System.out.println(name+" Не смог пробежать дорожку длинной "+Wall.getHeight());
        return false;
    }

    public boolean jump(){
        if (Wall.getHeight()<getMaxJump()){
            System.out.println(name+" Смог перепрыгнуть стену высотой "+Wall.getHeight());
            return true;
        }
        System.out.println(name+" Не смог перепрыгнуть стену высотой "+Wall.getHeight());
        return false;
    }

}
