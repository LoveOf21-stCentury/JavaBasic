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
        System.out.println(pow(3, 0));
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
}


