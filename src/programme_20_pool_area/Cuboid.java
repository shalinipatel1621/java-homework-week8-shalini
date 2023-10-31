package programme_20_pool_area;
//class created cuboid

public class Cuboid extends Rectangle {//write a class name cuboid that extends rectangle class

    private double height;

    public Cuboid(double width, double length, double height) {//one constructor with three params width, height and length
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double area = super.getArea();
        return area * height;
    }
}
