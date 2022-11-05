package Part6.examples.animals;

public class Bat extends Animal implements CanFly{

    public Bat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bat eat");
    }

    @Override
    public void breathe() {
        System.out.println("Bat breathe");

    }

    @Override
    public void fly() {
        System.out.println("Bat fly");
    }
}
