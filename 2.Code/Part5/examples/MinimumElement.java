package Part5.examples;


import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner ;

    private static  int readInteger(){
        scanner = new Scanner(System.in) ;

        int input_arr ;

        input_arr= scanner.nextInt();

        scanner.close();



        return input_arr;
    }

    private static int[] readElements(int size){

        scanner = new Scanner(System.in) ;

        int[] input_arr = new int[size];

        for(int i = 0 ; i < size;i++){
            input_arr[i] = scanner.nextInt();
        }

        scanner.close();

        return input_arr;
    }

    private static int findMin(int[] arr){
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}