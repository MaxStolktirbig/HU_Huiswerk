package OOCD.JAVA.Summative_Assignment_9A;

public class Utils {
    public static void main(String[] args) {
    }

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        return String.format("€ %." + precisie + "f", bedrag);
    }
}
