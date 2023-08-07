package Les3.home_work;

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже

        int n = a.length;
        if (n == 1) return a;
        int mid = n / 2;
        int l[] = new int[mid];
        int r[] = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);
    }

    private static int[] merge(int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int a[] = new int[left + right];
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[idx++] = l[i++];
            } else {
                a[idx++] = r[j++];
            }
        }
        while (i < left) {
            a[idx++] = l[i++];
        }
        while (j < right) {
            a[idx++] = r[j++];
        }
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Merge {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 8, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}