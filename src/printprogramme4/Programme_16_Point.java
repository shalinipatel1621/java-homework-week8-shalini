package printprogramme4;

/**
 * Point
 */

public class Programme_16_Point {
    int x;
    int y;

    public Programme_16_Point() {
        this(0, 0);
    }

    public Programme_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(Programme_16_Point another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);

    }
//method named getX without params
    public int getX() {
        return x;
    }
//method named getY without params
    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3, 1);
        System.out.println("distance (0,0) = " + first.distance());
        System.out.println("distance(second)=" + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme_16_Point point = new Programme_16_Point();
        System.out.println("distance () = " + point.distance());

    }
}
