package Part5.examples;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner ;

    public static void main(String[] args) {
        int[] myIntArr = {1,20,3,14,433,5,6} ;
        printArray(sortIntegers(myIntArr));
    }

    public static int[] getIntegers(int size){

        scanner = new Scanner(System.in) ;

        int[] input_arr = new int[size];

        for(int i = 0 ; i < size;i++){
            input_arr[i] = scanner.nextInt();
        }

        scanner.close();

        return input_arr;
    }

    public static void printArray(int[] arr){
        for(int i = 0 ;i < arr.length ;i++){
            System.out.println("Element "+i+" contents "+arr[i]+"");
        }
    }

    public static int[] sortIntegers(int[] arr){
//        for (int j = 0; j < arr.length - 1; j++) {
//            for(int i  = j ; i < arr.length - 1 ; i++){
//                if ( arr[i] > arr[i + 1]){  // ascending
//                    //swap
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
        int lastIndex = arr.length - 1;
        for (int j =  lastIndex; j > 0 ; j--) {
            for(int i  = lastIndex ; i > (lastIndex - j) ; i--){
                System.out.println(""+j+"_"+i);
                if ( arr[i - 1] < arr[i] ){   // decending
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }

            }
//            System.out.println(Arrays.toString(arr));
        }

        return  arr;
    }
}