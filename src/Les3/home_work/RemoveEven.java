package Les3.home_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
//             System.out.println(list + " it's list" );
            Iterator iterator = list.iterator();

            while (iterator.hasNext()) {
                x = (Integer) iterator.next();
                if (x % 2 == 0) {
                    iterator.remove();
//                     System.out.print(x + " ");
                }
            }
        }
        System.out.println(list);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class RemoveEven{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}