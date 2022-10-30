package Part1;

public class NonPrimitiveDataType {
    public static void main(String[] args) {
        System.out.println("Part1.NonPrimitiveDataType");


        // String is immutable in JAVA , new string is created old one is discarded.
        String myFName = "Ramit";
        myFName = myFName + " Hero \u00A9 ";
        System.out.println(myFName + "Dour");

        String num_str = "225.55";

        String a = "4" ;
        int b = 5 ;
        System.out.println(a + b); //45 String
        System.out.println(b + a); //54 String

//        System.out.println((int)a + b); //ERROR java.lang.String cannot be converted to int
//        System.out.println(b + (int)a); //ERROR java.lang.String cannot be converted to int

//        System.out.println((Integer)a + b); // ERROR ava: incompatible types: java.lang.String cannot be converted to java.lang.Integer
//        System.out.println(b + (Integer)a); // ERROR ava: incompatible types: java.lang.String cannot be converted to java.lang.Integer

        System.out.println( Integer.valueOf(a) + b); //9
        System.out.println(b +  Integer.valueOf(a)); //9

        //better
        System.out.println( Integer.parseInt(a) + b); //9
        System.out.println(b +  Integer.parseInt(a)); //9


        // NEXT CONCEPT:StringBuffer



    }
}
