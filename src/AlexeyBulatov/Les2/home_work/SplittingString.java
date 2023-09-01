package AlexeyBulatov.Les2.home_work;

import java.util.Arrays;

public class SplittingString {
    public static void main(String[] args) {
        splitLetters("ааддд");
    }

    public static void splitLetters(String str) {
        int[] letterCount = new int[36];
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isLetter(letter)) {
                letterCount[Character.toLowerCase(letter) - 'а']++;
            }
        }
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] > 0) {
                System.out.println((char) ('а' + i) + " is " + letterCount[i]);
            }
        }
    }
}
