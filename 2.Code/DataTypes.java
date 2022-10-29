public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Data types");


        int myNum = 5;               // Integer (whole number)

        myNum = Integer.MAX_VALUE;
        myNum = Integer.MIN_VALUE;

        myNum = 2_147_483_646; // You can put underscore to make it readable

        float myFloatNum = 5.99f;    // Floating point number
        double myDoubleNumm = 5.99;    // Double Floating point number without d , works
        double myDoubleNum = 5.99d;    // Double Floating point number
        char myLetter = 'D';         // Character
        char myChar = '\u0044';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myChar);
        System.out.println(myBool);
        System.out.println(myText);


//        Primitive data types - includes byte, short, int, long, float, double, boolean and char
//        Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

//        DataType	Size	Description
//        byte	    1 byte	Stores whole numbers from -128 to 127
//        short	    2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	    8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (BigInteger)
//        float	    4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values
//        char	    2 bytes	Stores a single character/letter or ASCII values


        byte myMinByteVal = Byte.MIN_VALUE;

        System.out.println(myMinByteVal);

//        Casting

        int myTotal = (myMinByteVal / 2);

//        byte myNewByteVal = (myMinByteVal / 2); // ERROR beacause of 2 in int
        byte myNewByteVal = (byte) (myMinByteVal / 2); // Casting by (byte)


    }
}
