package Part9.examples.sets;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        Set<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);

        System.out.println(s1); // [1, 2, 3, 4]
        System.out.println(s2); // [3, 4, 5, 6]
        System.out.println(" ");
        System.out.println(s1.removeAll(s2)); //true
        System.out.println(s1); //[1, 2]
        System.out.println(s2); //[3, 4, 5, 6]






    }
}
