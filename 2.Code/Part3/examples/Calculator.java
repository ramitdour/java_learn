package Part3.examples;

public class Calculator {
    private final Floor floor;
    private final Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public  double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

}
