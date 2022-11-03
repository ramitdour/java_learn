package Part3.example2;

import Part3.example2.Animal;

/**
 * Created by dev on 6/07/15.
 */
public class Fish extends Animal {

    private final int gills;
    private final int eyes;
    private final int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);


    }
}
