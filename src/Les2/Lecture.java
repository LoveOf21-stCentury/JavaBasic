package Les2;

public class Lecture {
    public static void calculate(char op, int a, int b) {
        switch (op) {
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '+':
                System.out.println(a + b);
                break;
            default:
                System.out.println("none");
                break;
        }
    }

    public static void main(String[] args) {
        calculate('.', 9,  4);
    }
}

