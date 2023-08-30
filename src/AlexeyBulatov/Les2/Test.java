package AlexeyBulatov.Les2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        String str = "dab";
//        char c = str.charAt(0);
//        String substring = str.substring(1, 2);
//        System.out.println(substring);
//        polindrone("mam");
        int q = 3;
        int x = 10;
        int[] array = new int[q];
        generateCombination(array, 0, x);
    }

    public static void polindrone(String str) {
        //polindrome
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Not polindrome");
        }
    }

    private static void generateCombination(int array[], int index, int x) {
//        5. *+Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//        Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
        if (index == array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i = 0; i < x; i++) {
            array[index] = i;
            generateCombination(array, index + 1, x);
        }
    }


}
