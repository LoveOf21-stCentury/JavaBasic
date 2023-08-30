package AlexeyBulatov.home_work;

public class Triangle {
//    3.	+Написать программу вычисления n-ого треугольного числа.
    public static void main(String[] args) {
        int n = 17;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = (n * (n + 1)) / 2;
        }
        System.out.println(result);
    }
}