package Part8;



 abstract class A {
    private int a;
    public A(){
        System.out.println("A() ");
        this.a = 0;
    }
    public A(int a) {
        System.out.println("A(a) ");
        this.a = a;
    }

    public void m1(){
        System.out.println("A m1");
    }

    public static void s1_m_A(){
        System.out.println("s1_m_A");
    }


}

class B extends A{
    public B() {

//        super();
        super(1);
//        A a = new A();

        System.out.println("B () ");

    }

    public B(int a) {
//        super(a);
        super();
    }

    public B(int a , int b){

        this();
//        super();
        System.out.println("B (a b) ");

    }

    @Override
    public void m1(){
        super.m1();
        System.out.println("B m1");
        super.m1();
    }


    public static void s1_m_A(){
        System.out.println("s1_m_B");
    }

}




public class Part8 {
    public static void main(String[] args) {
        System.out.println("naming conventions ,packages ,scope ,access modifiers ,static ,final");

        B b   = new B(1,2);
        b.m1();
        b.s1_m_A();

    }
}
