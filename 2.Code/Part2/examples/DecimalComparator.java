package Part2.examples;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int a1 = (int) (a*1000.0d);
        int b1 = (int) (b*1000.0d);
        return a1 == b1;
    }
}