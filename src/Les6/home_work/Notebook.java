package Les6.home_work;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Notebook {
    public static void main(String[] args) {
        ComputerSettings computer1 = new ComputerSettings("16Gb", "512Gb", "Linux", "silver");
        ComputerSettings computer2 = new ComputerSettings("4Gb", "128Gb", "MacOs", "black");
        ComputerSettings computer3 = new ComputerSettings("32Gb", "1500Gb", "Windows 10", "golden");
        ComputerSettings computer4 = new ComputerSettings("8Gb", "1Tb", "MacOs", "silver");
        ComputerSettings computer5 = new ComputerSettings("8Gb", "512Gb", "Windows 10", "golden");

        Set<ComputerSettings> set = new HashSet<>();
        set.add(computer1);
        set.add(computer2);
        set.add(computer3);
        set.add(computer4);
        set.add(computer5);
        System.out.println(set);
    }

}
