public class AreaOverloading {
    public AreaOverloading(int side) {
        int AreaOfSqr = side * side;
        System.out.println("Area of Square is : " + AreaOfSqr);
    }

    public AreaOverloading(int length, int breadth) {

        int AreaOfRect = length * breadth;
        System.out.println("Area of Rectangle : " + AreaOfRect);
    }

    public static void main(String[] args) {
        AreaOverloading area1 = new AreaOverloading(15);
        AreaOverloading area2 = new AreaOverloading(7, 14);
    }
}
