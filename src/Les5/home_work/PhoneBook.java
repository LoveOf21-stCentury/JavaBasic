package Les5.home_work;

import java.util.*;

public class PhoneBook implements Comparable<PhoneBook> {
    protected String name;
    protected int number;
    protected Map<String, ArrayList<Integer>> map;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Map<String, ArrayList<Integer>> getMap() {
        return map;
    }


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
        Collections.sort(bookMap);
        System.out.println(bookMap);
    }

    @Override
    public int compareTo(PhoneBook o) {
        return this.number - o.number;
    }
}


