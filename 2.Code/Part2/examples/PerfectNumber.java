package Part2.examples;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }

        int sum_div = 1;
        for(int i = 2 ; i < number;i++ ){
            if(number % i == 0){
                sum_div += i ;
                System.out.println(i);
            }
        }

        return sum_div == number;
    }
}
