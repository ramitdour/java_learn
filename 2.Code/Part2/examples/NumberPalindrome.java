package Part2.examples;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-11));
    }
    public static boolean isPalindrome( int number){
        int number_i =(number);

        if(number < 0) {
            number_i =(number * -1);
        }

        int reversed_no = 0 ;
        while (number_i > 0){
            reversed_no = (reversed_no * 10) + (number_i % 10);
            number_i = number_i / 10;

        }
        if(number < 0){
            reversed_no *= -1;
        }
        return number == reversed_no;

    }
}
