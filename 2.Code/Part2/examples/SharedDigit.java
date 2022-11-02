package Part2.examples;

public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int x , int y){
        if( (x < 10) || (x > 99) || (y < 10) || (y > 99)){
            return false ;}

        int x_a = x % 10 ;
        x /= 10 ;

        int y_a = y % 10 ;
        y /= 10;

        if( (x == y) ||(x == y_a) ||(x_a == y) ||(x_a == y_a) ){
            return true;
        }
        return false;
    }
}
