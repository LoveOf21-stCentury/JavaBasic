package Les2.home_work;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

class BubbleSort {

    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mass) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            bubbleSort(mass);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int[] bubbleSort(int[] mass) {
        boolean isSorted = false;
        int bubble;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    isSorted = false;
                    bubble = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = bubble;
                }
            }
            logStep(Arrays.toString(mass));

        }
        return mass;
    }

    public static void logStep(String note) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd, hh:mm");
            String timeStamp = dateFormat.format(new Date());
            fileWriter.write(timeStamp + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class BubbleS {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}