package Part2.examples;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        boolean flag = true ;

        int XX = 0;
        long YY = 0;


        while(flag){

            if(scanner.hasNextInt()){

                int i = scanner.nextInt();
                XX += i;
                YY++;

            }else{
                flag = false;
                if(YY == 0){
                    YY = 1 ;
                }

                YY = Math.round(((double)XX) / YY) ;
                System.out.println("SUM = "+ XX + " AVG = "+YY);
            }

            scanner.nextLine();


        }
        scanner.close();
    }
}
