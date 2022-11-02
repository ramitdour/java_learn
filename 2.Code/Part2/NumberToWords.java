package Part2;

public class NumberToWords {
    // write your code here

    public static void main(String[] args) {
        numberToWords(345);
        numberToWords(100);
        numberToWords(-2);
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int org_no = number;

        number = reverse(number);




        String num_name[] = {"Zero","One","Two","Three","Four","Five",
                "Six","Seven","Eight","Nine"} ;

        String ps = "";



        ps = ps + num_name[(number % 10)];
        number /= 10;

        while(number > 0 ){
            ps = ps + " " + num_name[(number % 10)];
            number /= 10;
        }

        if(getDigitCount(org_no) != getDigitCount(reverse(org_no))){
            for(int i = getDigitCount(org_no) - getDigitCount(reverse(org_no)) ; i > 0; i--){
                ps = ps + " " + num_name[0];
            }
        }

        System.out.println(ps);

    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int counter = 0;
        while(number > 0){
            number /= 10;
            counter++ ;
        }
        return counter;
    }

    public static int reverse(int number){
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

        return reversed_no;
    }
}
