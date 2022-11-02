package Part2.examples;

public class FactorPrinter {
    // write your code here
    public static void printFactors(int number){

        String s = "1";
        if( number < 1){
            System.out.println("Invalid Value");
        }else{
            for(int i = 2 ; i <= number;i++ ){
                if(number % i == 0){
                    s = s + " " + i;
                }
            }
            System.out.println(s);
        }

    }
}
