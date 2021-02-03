package lessons1;

import java.util.Random;

public class RunTrack {

    private int distance;

    public RunTrack(int distance) {
        this.distance = (int) (Math.random() *100);
    }

    public int getDistance() {

        return (int) (Math.random() *100);
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
