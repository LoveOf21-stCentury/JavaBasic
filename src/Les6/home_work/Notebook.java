package Les6.home_work;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        ComputerSettings computer1 = new ComputerSettings(16, 512, "Linux", "silver");
        ComputerSettings computer2 = new ComputerSettings(4, 128, "MacOs", "black");
        ComputerSettings computer3 = new ComputerSettings(32, 1500, "Windows", "golden");
        ComputerSettings computer4 = new ComputerSettings(8, 1000, "MacOs", "silver");
        ComputerSettings computer5 = new ComputerSettings(8, 512, "Windows", "golden");

        Map<Integer, String> userWishes = new HashMap<>();
        Map<String, String> filter = new HashMap<>();
        Set<ComputerSettings> show = new HashSet();
        Scanner scan = new Scanner(System.in);

        Set<ComputerSettings> set = new HashSet<>();
        set.add(computer1);
        set.add(computer2);
        set.add(computer3);
        set.add(computer4);
        set.add(computer5);

        userWishes.put(1, "OS (Linux/MacOs/Windows)");
        userWishes.put(2, "HHD");
        userWishes.put(3, "OZU");
        userWishes.put(4, "Color (silver/black/golden)");

        for (Map.Entry entry : userWishes.entrySet()) {
            System.out.println("Enter your wishes by " + entry.getValue());
            String user = scan.nextLine();
            filter.put((String) entry.getValue(), user);
        }
        scan.close();

        //увидела эту фунцию, она сравнивает пожелания покупателя, но у меня "0" не отрабатывется. Выдает ошибку. Пробовала его и в "" брать.
        for (ComputerSettings entry : set) {
            if ((entry.getOS().equals(filter.get("OS")) || filter.get("OS").equals(0)) &&
                    entry.getHHD() >= Integer.parseInt(filter.get("HHD")) &&
                    entry.getOZU() >= Integer.parseInt(filter.get("OZU")) &&
                    (entry.getColor().equals(filter.get("Color")) || filter.get("Color").equals(0))) {
                show.add(entry);
            }
        }
        System.out.println("Usefill: ");
        for (ComputerSettings el : show){
            System.out.println(el);
        }
    }

}
