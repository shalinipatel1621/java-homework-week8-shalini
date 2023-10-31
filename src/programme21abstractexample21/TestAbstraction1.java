package programme21abstractexample21;

/**
 * Create the fourth class name TestAbstraction1 and inside create the main method as below
 * //in real scenario method is called by programmer or user
 */

class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle1();//In a real scenario, object is provided through method like getShape()method
        s.draw();
    }
}


