package Les4;
import java.util.*;

public class Sem4 {

    public static void main(String[] args) {
//        task0();
//        taskStackAndQueue();
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.getSize());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.empty());
    }

    public static void taskTimeCurrent() {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            al.add(0, i);
        }
        long middle = System.currentTimeMillis();

        for (int j = 0; j < 100000; j++) {
            ll.add(0, j);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

    public static void task_num_text() {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Write some of command: ");
            String userStr = sc.nextLine();
            String arr[] = userStr.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("goodbay");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }

    }

    public static void taskReverse() {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Write some of command: ");
            String text = sc.nextLine();

            switch (text) {
                case "print":
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("goodbay");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    System.out.println("el deleted");
                    break;
                default:
                    list.add(text);
            }
        }

    }

    public static void taskStackAndQueue() {
        int[] arr = {3, 9, 6, 5, 2};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            queue.offer(arr[i]);
        }
        System.out.println("it's stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        System.out.println("it's queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}

class MyStack {
    private int[] arr = new int[10];
    private int size = 0;
    public int getSize() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(int num) {
        if (size == arr.length) {
            int[] arr2 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = num;
    }

    public int peek() {
        return arr[size - 1];
    }

    public int pop() {
        return arr[--size];
    }

}
