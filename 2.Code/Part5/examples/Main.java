package Part5.examples;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {
//        int[] myIntArr = new int[10] ;
        int[] myIntArr = {1,2,3,4,4,5,6} ;

        myIntArr[5] = 50;

//        System.out.println(myIntArr[5]);

        for (int i = 0; i <myIntArr.length; i++) {
            System.out.println(myIntArr[i]);
        }

        SortedArray s = new SortedArray();


    }
}
