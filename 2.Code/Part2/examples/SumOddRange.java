package Part2.examples;

public class SumOddRange {
    public static boolean isOdd(int x){
        return x >= 0 && (x % 2 != 0);

    }

    public static int sumOdd(int start , int end){
        int sumr = 0 ;
        if (!( start > 0 && end >= start )) {
            return -1;

        }
        for(int i =  start ; i <= end ;i++ ){
            if (isOdd(i)){
                sumr += i;

            }
        }
        return sumr;
    }

}