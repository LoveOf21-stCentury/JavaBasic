package Les5;

import java.util.*;

public class Sem5 {
    public static void main(String[] args) {
//        task0();
//        System.out.println(task2("(a+b(c-d)*2)"));
        task3("Мороз и солнце; день чудесный!\n" +
                "Еще ты дремлешь, друг прелестный —\n" +
                "Пора, красавица, проснись:\n");
    }

    static void task0() {
        Passports passports = new Passports();
        passports.add("2345", "George");
        passports.add("141245", "Milla");
        passports.add("153553", "Luice");
        passports.add("56366", "Linda");
        passports.add("66542", "Clark");
        System.out.println(passports.getByLastname("Milla"));
        System.out.println(passports.getByNumbPass("56366"));
        System.out.println(passports.getAll());
    }

    static boolean task1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (c2[i] != map.get(c1[i])) return false;
            } else {
                map.put(c1[i], c2[i]);
            }
            if (map.containsValue(c2[i])) return false;
        }
        return true;
    }

    static boolean task2(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('<', '>');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) stack.push(chars[i]);
            if (map.containsValue(chars[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != chars[i])
                    return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

    static void task3(String str) {
//        Мороз и солнце; день чудесный!
//        Еще ты дремлешь, друг прелестный —
//        Пора, красавица, проснись:
//        Открой сомкнуты негой взоры
//        Навстречу северной Авроры,
//        Звездою севера явись!
        str = str.replace(".", " ");
        str = str.replace("\n", " ");
        String[] words = str.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word : words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}

