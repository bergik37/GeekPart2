package lessons4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainRun {

    public List<String> search(List<String> list){
        return search(list);
    }



    public static void main(String[] args) {
        System.out.println("метод, переворачивающий строку");
        Mylambdareverse outStr=(str)->{
            String result="";
            for (int s = str.length()-1; s >= 0; s--)
                result+=str.charAt(s);
            return result;
        };
        System.out.println(outStr.reverse("java interview"));

        System.out.println("метод, который возвращает индекс первого вхождения данного целого числа в списке");

        MyLambdaSearch number=(n, list) -> {
            for (int i = 0; i < list.length; i++) {
                list[i] = i;
            }
            for(int num:list) {
                if (num==n)
                    return n;
            }
                return -1;
        };
        System.out.println(number.search(25,new Integer[4]));
        System.out.println("метод, который возвращает наибольшее целое число в списке");

        MyLambdaMax max=(list) -> {
            int maximum=0;
            for (int i = 0; i < list.length; i++) {
                list[i] = i;
            }
            for (int i = 0; i < list.length; i++)

                if (maximum < list[i])
                    maximum = list[i];
            return maximum;
        };
        System.out.println(max.maximum(new Integer[8]));
        System.out.println("метод, который возвращает среднее значение из списка целых чисел");

        MyLambdaMid mid=(list) -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, i);
            }
            return list.stream().mapToDouble(val -> val).average().orElse(0.0);
        };
        System.out.println(mid.average(Arrays.asList(new Integer[5])));




        


    }
}
