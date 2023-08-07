package Les2;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
public class Sem2 {
    public static void main(String[] args) {
        task01(8, 'h', 'a');
//        task02("ппдддллллааттттт");IO
//        System.out.println(task03("1234321"));
//        task04saveToFile(task04Repeat("Test", 6));
//        saveToFileAnalog(task04Repeat("ldldwl", 20));
    }

    static void task01(int n, char c1, char c2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                stringBuilder.append(c1).append(c2).append(" ");
            }
            System.out.println(stringBuilder);
        } else {
            System.out.println("not even.");
        }
    }

    static void task02(String str) {
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                stringBuilder.append(arr[i - 1]).append(count + 1);
                count = 0;
            }
        }
        stringBuilder.append(arr[arr.length - 1]).append(count + 1);
        System.out.println(stringBuilder);
    }

    static boolean task03(String str) {
//      Текст задачи:
//      Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
        StringBuilder stringBuilder = new StringBuilder(str);
        String str2 = stringBuilder.reverse().toString();

        return str.equals(str2);
    }

    static String task04Repeat(String str, int n) {
//        Текст задачи:
//        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет
//        эту строку в простой текстовый файл, обработайте исключения.
        return str.repeat(n);
    }

    static void task04saveToFile(String str) {
        String path = "text.txt";
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(str);
            writer.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    static void saveToFileAnalog(String str) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        String path = "t/t/t/kltext.txt";
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(str);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.INFO, e.getMessage());
        }
        fileHandler.close();
        logger.getHandlers()[0].close();
    }
}


