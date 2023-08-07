package Les4.home_work;

import java.util.LinkedList;
import java.util.List;

class MyQueue<T> {
    // Напишите свое решение ниже

    private LinkedList<T> elements = new LinkedList<>();

    public MyQueue() {
    }

    public MyQueue(LinkedList<T> elements) {
        this.elements = elements;
    }


    public void enqueue(T element) {
        // Напишите свое решение ниже
        elements.add(element);
    }

    public T dequeue() {
        // Напишите свое решение ниже
        T first = elements.getFirst();
        return elements.removeFirst();

    }

    public T first() {
        // Напишите свое решение ниже
        return elements.getFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return elements;
    }
}


public class Queue_Realiz {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
