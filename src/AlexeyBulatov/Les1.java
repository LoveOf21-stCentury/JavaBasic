package AlexeyBulatov;

import java.util.Scanner;

public class Les1 {
    //1.	+Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ: 1
//    Пример 4: а = 0, b = 0, ответ: не определено
//    Пример 5
//    входные данные находятся в файле input.txt в виде
//    b 3
//    a 10
//    Результат нужно сохранить в файле output.txt
//1000
    public static void main(String[] args) {
//        System.out.println(pow(3, 0));

        int a1 = 1;
        int b1 = 7;
        int c1 = 2;
        int d1 = 1;
        String str = "";
        task1(a1, b1, c1, d1, str);
    }

    private static double pow(double a, double b) {
        if (a == 0 || a == 1) {
            return a;
        }
        if (b < 0) {
            b = -b;
            a = 1 / a;
        }
        if (b == 0) {
            return 1;
        }
        double result = 1;

        for (int i = 0; i < b; i++) {
            result = result * a;
        }

        return result;
    }

    private static double pow2(double a, double b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            return pow(1 / a, -b);
        }
        double result = pow2(a, b / 2);

        if (b % 2 == 0) {
            return result * result;
        } else {
            return result * result * a;
        }
    }


    public static void task1(int a, int b, int c, int d, String str) {
        //2.	+На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
//- команда 1 (к1): увеличить в с раза, а умножается на c
//- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
//    написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
//    Пример 1: а = 1, b = 7, c = 2, d = 1
//    ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
//            Пример 2: а = 11, b = 7, c = 2, d = 1
//    ответ: нет решения.
//            *Подумать над тем, как сделать минимальное количество команд

        if (a > b) {
            return;
        } else if (a == b) {
            System.out.println("Solution is " + str);
            return;
        }
        if (c != 0) {
            task1(a + d, b, c, d, str + " k1");
        }
        if (d != 0 || d != 1) {
            task1(a * c, b, c, d, str + " k2");
        }

    }
}


