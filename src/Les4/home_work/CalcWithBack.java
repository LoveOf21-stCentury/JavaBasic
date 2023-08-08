package Les4.home_work;

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    public Deque<Integer> resultStack = new ArrayDeque<>();
    public Deque<Character> operationStack = new ArrayDeque<>();
    public int prevResult;

    public int calculate(char op, int a, int b) {
        if (op == '<') {
            if (resultStack.size() >= 2) {
                resultStack.pop();
                prevResult = resultStack.peek();
            }
            return prevResult;
        } else {
            int result = calcOperation(op, a, b);
            resultStack.push(result);
            operationStack.push(op);
            prevResult = result;
            return result;
        }
    }
        private int calcOperation (char op, int a, int b){
            switch (op) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    return a / b;
                case ' ':
                    System.out.println("Некорректный оператор: " + op + "");
                default:
                    System.out.println("Некорректный оператор: " + op + "");
            }
            return op;
        }

    }



public class CalcWithBack {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
