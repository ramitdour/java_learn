package Part2.examples;

public class LastDigitChecker {
    // write your code here
    public static boolean hasSameLastDigit(int a ,int b , int c){
        if( (a < 10) || (a > 1000) || (b < 10) || (b > 1000) || (c < 10) || (c > 1000)){
            return false ;

        }
        int x =  (a%10) ;
        int y = ( b%10) ;
        int z =  (c%10);


        if ( x ==y || y == z || z == x ){
            return true;
        }
        return false;
    }

    public static boolean isValid(int n){
        if ( (n < 10 )|| (n > 1000)) { return false;}
        return true;
    }
}