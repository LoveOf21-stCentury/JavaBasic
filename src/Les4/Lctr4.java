package Les4;

import java.util.ArrayList;
import java.util.List;

public class Lctr4 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j<arr.length; j++){
            list.add(arr[j]);
        }
        System.out.println(list);
        list.remove(17);
        System.out.println(list);
        long finish = System.currentTimeMillis();
        System.out.println(finish);
    }
}
