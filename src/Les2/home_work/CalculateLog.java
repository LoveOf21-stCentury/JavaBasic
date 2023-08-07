package Les2.home_work;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Calculator {
    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        try (FileWriter fileWriter = new FileWriter(new File("log.txt"), true)) {
            logStep(fileWriter, "User entered the first operand = " + a);
            logStep(fileWriter, "User entered the operation = " + b);
            logStep(fileWriter, "User entered the second operand = " + op);

            switch (op) {
                case '*':
                    int mult = a * b;
                    logStep(fileWriter, "Result is " + mult);
                    return mult;
                case '/':
                    int dem = a / b;
                    logStep(fileWriter, "Result is " + dem);
                    return dem;
                case '-':
                    int minus = a - b;
                    logStep(fileWriter, "Result is " + minus);
                    return minus;
                case '+':
                    int sum = a + b;
                    logStep(fileWriter, "Result is " + sum);
                    return sum;
                default:
                    throw new IllegalArgumentException("none: " + op);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
    private void logStep(FileWriter fileWriter, String note) throws IOException {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedTime = currentTime.format(formatter);
        fileWriter.write(formattedTime + " " + note + "\n");
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class CalculateLog {

    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '*';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        clearLogFile();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);

        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearLogFile() {
        File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(logFile, false);
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

