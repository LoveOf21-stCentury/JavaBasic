package Les6.home_work;

public class ComputerSettings {
    String OZU;
    String HDD;
    String OS;
    String color;


    public ComputerSettings(String OZU, String HDD, String OS, String color) {
        this.OZU = OZU;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    //    @Override
//    public String toString() {
//        return "ComputerSettings{" +
//                "OZU='" + OZU + '\'' +
//                ", HDD='" + HDD + '\'' +
//                ", OS='" + OS + '\'' +
//                ", color='" + color + '\'' +
//                '}';
//    }
    @Override
    public String toString() {
        return "Computer: OZU = " + OZU + "; HHD = " + HDD + "; OS = " + OS + "; color = " + color;
    }
}
