package Les6.home_work;

public class ComputerSettings {
    private int OZU;
    private int HHD;
    private String OS;
    private String color;


    public ComputerSettings(int OZU, int HDD, String OS, String color) {
        this.OZU = OZU;
        this.HHD = HDD;
        this.OS = OS;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer: OZU = " + OZU + "; HHD = " + HHD + "; OS = " + OS + "; color = " + color;
    }

    public int getOZU() {
        return OZU;
    }

    public int getHHD() {
        return HHD;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }
}
