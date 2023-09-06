package AlexeyBulatov.Les2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    static char[] textGlobal;
    static ArrayList<Integer> signIndexesGlobal = new ArrayList<>();

    public static void main(String[] args) {
//        String str = "dab";
//        char c = str.charAt(0);
//        String substring = str.substring(1, 2);
//        System.out.println(substring);
//        polindrone("mam");

        String text = "5? + 1? = ??";
        ArrayList<Integer> signIndexes = new ArrayList<>();

        char[] textChars = text.replaceAll(" ", "").toCharArray();
        for (int i = 0; i < textChars.length; i++) {
            if (textChars[i] == '+' || textChars[i] == '=') {
                textChars[i] = '-';
            }

            if (textChars[i] == '?') {
                signIndexes.add(i);
            }
        }
        textGlobal = textChars;
        signIndexesGlobal = signIndexes;

        generateCombination(new int[signIndexes.size()], 0, 10);
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

    private static void generateCombination(int[] arrays, int index, int k) {
//        5. *+Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//        Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
        if (index == arrays.length) {
            checkCombination(arrays);
            return;
        }
        for (int i = 0; i < k; i++) {
            arrays[index] = i;
            generateCombination(arrays, index + 1, k);
        }
    }

    private static void checkCombination(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            textGlobal[signIndexesGlobal.get(i)] = Character.forDigit(arrays[i], 10);
        }

        String[] numbers = String.valueOf(textGlobal).split("-");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c) {
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }

}
