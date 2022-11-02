package Part2;

public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first , int second){
        if( (first < 10) || (second < 10)){
            return -1;
        }
        int larger = (first > second ) ? second : first ;


        for(int i = larger   ; i > 0; i--){
            if( (first % i == 0)  && ( second % i == 0)){
                return i;
            }
        }

        return -1;
    }
}
