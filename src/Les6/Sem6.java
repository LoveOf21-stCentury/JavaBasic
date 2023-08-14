package Les6;

import java.lang.reflect.Array;
import java.util.*;

public class Sem6 {
    public static void main(String[] args) {
//        task0();
//        task1(createArr(100, 0, 24));
        Cat cat1 = new Cat("Kitty", "Fedor", "dvornyaga", 6);
        Cat cat2 = new Cat("Faty", "Liza", "persian", 4);
        Cat cat3 = new Cat("Tutu", "Vishnya", "main-kun", 15);
        Cat cat4 = new Cat("Faty", "Liza", "persian", 4);



        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        System.out.println(cat2.equals(cat4));
        System.out.println(set);
    }


    static void task0() {
        Integer[] integers = {1, 9, 3, 2, 5, 3, 2, 6, 9};
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(integers));
        Set<Integer> linkedSet = new LinkedHashSet<>(Arrays.asList(integers));
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(integers));
        List<Integer> list = new ArrayList<>(Arrays.asList(integers));

        System.out.println(hashSet);
        System.out.println(linkedSet);
        System.out.println(treeSet);
        System.out.println(list);
    }

    static void task1(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100 / arr.length;
        System.out.println(percent);
    }

    static Integer[] createArr(int size, int max, int min) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
}
