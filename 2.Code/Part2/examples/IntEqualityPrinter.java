package Part2.examples;

public class IntEqualityPrinter {
    // write your code here
    public static void printEqual(int a, int b ,int c){
        if(a < 0 || b < 0 || c < 0 ){
            System.out.println("Invalid Value");
        }else{
            if (a == b){
                if (b == c) {
                    System.out.println("All numbers are equal");
                } else {
                    System.out.println("Neither all are equal or different");
                }

            }else{
                if (b == c){
                    System.out.println("Neither all are equal or different");
                }else{
                    if(a == c){
                        System.out.println("Neither all are equal or different");
                    }
                    else{
                        System.out.println("All numbers are different");
                    }
                }
            }
        }
    }
}
