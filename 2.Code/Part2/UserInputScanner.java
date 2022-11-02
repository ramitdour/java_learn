package Part2;

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("birth year");
        int year = scanner.nextInt();
        scanner.nextLine(); // Handle next line character(the enter key)
        System.out.println("year=" + year);
        System.out.println("age=" + (2022 - year));

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("your name is " + name);

//        System.out.println("birth year");
//        int year = scanner.nextInt();
//        System.out.println("year=" + year);
//        System.out.println("age=" + (2022 - year));

        System.out.println("enter date ");
        if(scanner.hasNextInt()){
            int date = scanner.nextInt();
//            scanner.nextLine(); // Handle next line character(the enter key)
            System.out.println("date=" + date);
        }else{
            System.out.println(" invalid date");
//            scanner.nextLine(); // Handle next line character(the enter key)
        }
        scanner.nextLine(); // Handle next line character(the enter key)


        scanner.close();

    }
}
