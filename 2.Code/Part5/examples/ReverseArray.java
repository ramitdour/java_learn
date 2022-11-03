package Part5.examples;

public class ReverseArray {
    private static void reverse(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("Array = [");
            }

            if(i == arr.length -1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }

        for (int i = 0; i < (arr.length/2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = temp ;
        }

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("Reversed array = [");
            }

            if(i == arr.length -1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }


    }
}
