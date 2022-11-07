package Part9.examples.sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        String str = "sfdas sfsd dsfgr ww dsfov o jl huih osdf uighif  q w e r vvhdk dgd a a a a";
        List<String> str_list = Arrays.asList(str.split(" ")) ;//  new ArrayList<>(str.split(" ").clone());
        s.addAll(str_list);

        System.out.println(s);
        Student shero = new Student("heroo");
        Student[] student_array = {
                new Student("aayush"),
                new Student("ramit") ,
                new Student("ishita") ,
                new Student("cheri") ,
                new Student("neerav") ,
                new Student("aayush"),
                shero
        };

        List<Student> student_list = new ArrayList<>(Arrays.asList(student_array.clone()));

        Set<Student> student_set = new HashSet<>();
        student_set.addAll(student_list);

        System.out.println(student_set);

        shero.setHeight(1);

        System.out.println(student_set);

        for (Student ss:student_set
             ) {
            if (ss.name == "heroo"){
                ss.setHeight(69);
            }
        }

        System.out.println(student_set);
//        System.out.println(shero);
//        System.out.println(student_array[5]);





    }

    private static class  Student{
        private final String name ;
        private final int rollno ;
        private static int ROLL_COUNT = 1 ;
        private int height ;


        private Student(String name) {
            this.name = name;
            this.rollno = ROLL_COUNT;
            ROLL_COUNT++;
            this.height = this.rollno* 100 ;
        }

        @Override
        public String toString() {
            return name + " \t" + rollno +"/"+ ROLL_COUNT +" h="+height + "\n";
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public boolean equals(Object obj) {
//            return super.equals(obj);
            if(obj == null || this.getClass()  != obj.getClass()){
                return  false;
            }
            if((((Student)obj).name).compareToIgnoreCase(this.name) == 0){
                return true;
            }
            return false;
        }


        @Override
        public int hashCode() {
//            return 0;
            return this.name.hashCode();
        }
    }
}
