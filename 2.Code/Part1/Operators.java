package Part1;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Part1.Operators");


        int a = 7 ;
        int b = 2 ;
//        + -   *   /   %
//         +=   -=  *=  /=  %=
        // i -- i++
        // ++i --i

        // Logical conditional operators  !  , && ,||
         // & , ^ ,|  bitwise Boolen logical AND.ExOR ,IncOR
//        relational operators
// == , != , > ,<= ,> ,>=

//        Ternary operator condition ? if true : if false

// Bitwise operators
//                <<, Left shift operator
//                >>, Signed Right shift operator
//                >>>, Unsigned Right shift operator
//
//                instanceof operator: <object instance of class/subclass/interface>
        int i = 7 ;
        System.out.println("\ni++");
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);

        i = 7 ;
        System.out.println("\ni--");
        System.out.println(i);
        System.out.println(i--);
        System.out.println(i);

        i = 7 ;
        System.out.println("\n++i");
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        i = 7 ;
        System.out.println("\n--i");
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);
    }
}
