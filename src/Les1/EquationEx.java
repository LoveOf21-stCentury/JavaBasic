package Les1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Equation {
    public static String getSolution(String str) {
        String inputString = getDataFromFile(str);
        System.out.println("Given the equation: " + inputString);

        ArrayList<String> list = new ArrayList<>(List.of(inputString.split(" ")));
        list.remove("+");
        list.remove("-");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                int x = Integer.parseInt(list.get(0).replace("?", String.valueOf(i)));
                int y = Integer.parseInt(list.get(1).replace("?", String.valueOf(i)));
                if (x + y == Integer.parseInt(list.get(2))){
                    return String.format("Result: %d + %d = %d", x, y, Integer.parseInt(list.get(2)));
                }
            }
        }
        return "No solution";
    }

    public static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return "";
        }
    }
}


public class EquationEx {
    public static void main(String[] args) {
        String file = "";

        if (args.length == 0) {
            file = "input.txt";
        } else {
            file = args[0];
        }

        Equation eq = new Equation();
        String result = eq.getSolution(file);
        System.out.println(result);
    }
}