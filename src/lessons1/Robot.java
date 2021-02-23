package lessons1;

public class Robot {


    private String name;
    private int maxJump;
    private int maxRun;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public boolean run(int maxRunDistance) {
        if (maxRunDistance < maxRun) {
            System.out.println(name + " Смог пробежать дорожку длинной " + maxRunDistance);
            return true;
        }
        System.out.println(name + " Не смог пробежать дорожку длинной " + maxRunDistance);
        return false;
    }

    public boolean jump(int maxJumpDistance) {
        if (maxJumpDistance < maxJump) {
            System.out.println(name + " Смог перепрыгнуть стену высотой " + maxJumpDistance);
            return true;
        }
        System.out.println(name + " Не смог перепрыгнуть стену высотой " + maxJumpDistance);
        return false;
    }
}
