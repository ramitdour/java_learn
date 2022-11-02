package Part2;

public class StringMethods {
    public static void main(String[] args) {
        String ns = "123";
//        System.out.println(ns.getClass() + ns);

        int n = Integer.parseInt(ns);
        System.out.println( n);

        double dd = Double.parseDouble("123.43f" +
                "");

        float ff = Float.parseFloat("1231.342423423d");

        System.out.println(ff);

    }
}
