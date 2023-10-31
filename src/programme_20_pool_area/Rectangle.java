package programme_20_pool_area;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double width() {
        if (width < 0) {
        }
        return 0;
    }

    public double length() {
        if (length < 0) {

        }
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;

    }

    public double getArea() {
        return (width * length);
    }
}
