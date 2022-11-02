package Part2.examples;

public class LargestPrime {
    // write your code here
    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(3));
        System.out.println(getLargestPrime(4));
    }
    public static int getLargestPrime(int number){
        if( number < 0){
            return -1;
        }

        for(int i = number ; i > 1; i--){
            if(number % i == 0){
                boolean isPrime = true ;
                for(int j = 2 ; j <= i/2 ; j++){
                    if(i % j == 0){
                        isPrime = false ;
                    }
                }
                if (isPrime){
                    return i;
                }
            }
        }
        return -1;
    }
}
