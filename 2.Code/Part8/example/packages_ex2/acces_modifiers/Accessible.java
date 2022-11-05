package Part8.example.packages_ex2.acces_modifiers;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering.

 interface Accessible {
    // public final redundant here
    public final int SOME_CONSTANT = 100;

    // public abstract  redundant here
    public abstract void methodA();
    public abstract void methodB();
    boolean methodC();
}