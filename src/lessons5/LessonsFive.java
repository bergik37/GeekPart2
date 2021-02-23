package lessons5;

public class LessonsFive  {

    static final int SIZE = 10;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public long oneMethod() {

        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long finish = System.currentTimeMillis();

        long a = finish - start;
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish2 = System.currentTimeMillis();
        long b = finish2 - start2;
        System.out.println(arr[5]);
        return b - a;
    }

    public long secondMethod(){

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long start2=System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr,HALF, arr2, 0, HALF);

        new Thread(()->{
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (float) (arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (float) (arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        long finish2=System.currentTimeMillis();
        long b=finish2-start2;
            System.out.println(arr[5]);
        return b;
    }

    public static void main(String[] args) {
        LessonsFive lessonsFive = new LessonsFive();
        System.out.println(lessonsFive.oneMethod());
        System.out.println(lessonsFive.secondMethod());
    }


}
