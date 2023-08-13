package Les5.home_work;

import java.util.*;

public class PhoneBook {
    public static void addNumber(String name, int number, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(name)) {
            map.get(name).add(number);
        } else {
            ArrayList<Integer> list = new ArrayList();
            list.add(number);
            map.put(name, list);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookMap = new HashMap<>();
        addNumber("Vladimir", 2744, bookMap);
        addNumber("Vladimir", 2394, bookMap);
        addNumber("Petr", 8794, bookMap);
        addNumber("Angi", 2864, bookMap);
        addNumber("Petr", 2792, bookMap);
        addNumber("Marina", 2794, bookMap);
        addNumber("Marina", 2724, bookMap);
        addNumber("Vasilina", 2795, bookMap);
        addNumber("Vasilina", 2800, bookMap);
        addNumber("Vasilina", 1, bookMap);
        System.out.println(bookMap);
    }
}
