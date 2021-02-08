package lessons5;

public class LessonsFive {

    static final int SIZE = 10000000;
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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish2 = System.currentTimeMillis();
        long b = finish2 - start2;
        return b - a;
    }

    public long secondMethod() {

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        float[] arr3 = new float[SIZE];

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr2, 0, arr2, 0, HALF);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1;
        }

        System.arraycopy(arr1, 0, arr3, 0, HALF);
        System.arraycopy(arr2, 0, arr3, HALF, HALF);

       //System.out.println(arr3[2]);

        long finish = System.currentTimeMillis();
        long a = finish - start;


        long start2=System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr2, 0, arr2, 0, HALF);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(arr1, 0, arr3, 0, HALF);
        System.arraycopy(arr2, 0, arr3, HALF, HALF);


        long finish2=System.currentTimeMillis();
        long b=finish2-start2;
        //System.out.println(arr3[2]);
        return b-a;
    }

    public static void main(String[] args) {
        LessonsFive lessonsFive = new LessonsFive();
        System.out.println(lessonsFive.oneMethod());
        System.out.println(lessonsFive.secondMethod());
    }
}
