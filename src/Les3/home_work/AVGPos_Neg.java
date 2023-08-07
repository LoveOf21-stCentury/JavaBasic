package Les3.home_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Answer3 {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            list.add(arr[i]);
        }

        Collections.sort(list);
        System.out.println(list);
        Integer minVal = Collections.min(list);
        System.out.println("Minimum is " + minVal);
        Integer maxVal = Collections.max(list);
        System.out.println("Maximum is " + maxVal);
        int sum = 0;
        for(int x : list){
            sum+= x;
        }

        System.out.println("Average is = " + sum/list.size());


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class AVGPos_Neg {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
//         '-2, -1, 0, 1, 2, 3, 4, 5

//         4, 2, 7, 5, 1, 3, 8, 6, 9
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer3 ans = new Answer3();
        ans.analyzeNumbers(arr);
    }
}
