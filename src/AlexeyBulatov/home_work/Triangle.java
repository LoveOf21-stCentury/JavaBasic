package AlexeyBulatov.home_work;

import java.util.Scanner;

public class Triangle {
    //    3.	+Написать программу вычисления n-ого треугольного числа.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your input");
        int n = s.nextInt();
        calculate(n);
    }

    public static void calculate(int n) {
        System.out.println(n * (n + 1) / 2);
    }
}