package Part8.example.packages_ex2.x;

import java.util.Scanner;

public class X {
    private int x;

    public X(int x){
        this.x = x;
    }

    public X(Scanner x){
        System.out.println("Please enter a number");
        this.x = x.nextInt();
        x.close();
    }

    public void x(){
        for (int x = 1; x <= 12 ; x++) {
            System.out.println(this.x*x);
        }
    }
}
