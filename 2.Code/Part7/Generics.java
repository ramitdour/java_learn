package Part7;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Generics");

//        Stronger type checks at compile time.
//        A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.

//        Elimination of casts.
//        The following code snippet without generics requires casting:
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);

//        When re-written to use generics, the code does not require casting:
        List<String> list1 = new ArrayList<String>();
//        List<String> list1 = new ArrayList<>();
        list.add("hello");
        String ss = list1.get(0);   // no cast


    }
}
