package Part3.example2;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height < 0){
            this.height = 0;
        }else {
            this.height = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return height * getArea();
    }
}
