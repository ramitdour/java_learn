package Part2;

public class SwitchForWhileDowhile {
    public static void main(String[] args) {

        int v = 3 ; // can be int/char

        switch (v) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;

            case 3: case 4: case 5:
                System.out.println("345");
                break;

            default:
                System.out.println("not 1 or 2");
                break; // not req , still work
        }

        System.out.println("done Switch ");


        System.out.println("--------------------------------------");

        // 1check condition , 2do task , 3 execute iteration sterp
        for(int i  = 0 ;i < 10 ; i++){
            if(i ==7){
//                break;
                continue;
            }
            System.out.println(i);
        }
        System.out.printf("your bill is %.2f Rupees%n", 2.948139f);

        int counter_while = 1;
        while (counter_while < 10){
            System.out.println(counter_while);


            counter_while++;

            // Unnecessary
            if(counter_while == 3){
                continue;
            }
        }

        int counter_while2 = 1;
        while (true){
            System.out.println("i= "+ counter_while2);
            if(counter_while2 == 3){
                counter_while2++;
                continue;
            }

            if(counter_while2 == 6){
                break;
            }

            System.out.println("i= "+ counter_while2);
            counter_while2++;
        }



        int counter_do_while = 1;
        // ALways going to be executed once
        do{
            System.out.println("dw= "+ counter_do_while);
            counter_do_while++;
        }while (counter_do_while < 4);



    }

}
