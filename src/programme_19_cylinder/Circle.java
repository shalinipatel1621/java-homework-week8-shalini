package programme_19_cylinder;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

}
