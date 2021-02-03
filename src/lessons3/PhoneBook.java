package lessons3;

import java.util.TreeMap;

public class PhoneBook {
        TreeMap<String,Integer> myTreeMap=new TreeMap<>();

        @Override
        public String toString() {
            return "PhoneBook{" +
                    "myTreeMap=" + myTreeMap +
                    '}';
        }

        public void setMyTreeMap(String fio,int number) {
            myTreeMap.put(fio,number);
        }

        public void getMyTreeMap(String fio) {
            System.out.println(myTreeMap.get(fio));
        }
    }

