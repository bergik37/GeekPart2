package lessons3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainRun {

    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {

        ArrayList<String> newListTwo = new ArrayList<>();
        for (String element: list) {
            if (!newListTwo.contains(element)) {
                newListTwo.add(element);
            }
        }
        return newListTwo;
    }

    public static ArrayList <String> removeDuplicatesThree(ArrayList<String> list) {

        Set<String> set = new LinkedHashSet<>();

        set.addAll(list);
        list.clear();
        list.addAll(set);

        return list;
    }

    public static void main(String[] args) {
        int dubler;

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 5; i++) {
                list.add("word" + i);
            }
        }
        list.add("WordWord");
        list.add("WAR");
        list.add("rebus");
        System.out.println("Massiv "+list);

        List<String> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Use JavaStream "+newList);

        ArrayList<String> newListTwo=removeDuplicates(list);
        System.out.println("Use Iterator "+newListTwo);

        dubler=list.size()-newListTwo.size();

        System.out.println("Количество дублирующих слов в массиве "+dubler);

        ArrayList<String> newListThree=removeDuplicatesThree(list);
        System.out.println("Use LinkedHashSet "+newListThree);

        System.out.println();

        System.out.println("Задание часть 2");
        System.out.println();
        PhoneBook phoneBook=new PhoneBook();

        phoneBook.setMyTreeMap("O1",6660);
        phoneBook.setMyTreeMap("O2",4442);
        phoneBook.setMyTreeMap("O3",4446);
        phoneBook.setMyTreeMap("O1", 911);
        phoneBook.setMyTreeMap("O5", 91169);

        phoneBook.getMyTreeMap("O2");





    }
}
