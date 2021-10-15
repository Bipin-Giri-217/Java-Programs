public class VolumeOverloading {

    public VolumeOverloading(int side) {
        int Vol = side * side * side;
        System.out.println("Volume of Cube is :" + Vol);
    }

    public VolumeOverloading(int length, int breadth, int height) {
        int Vol = length * breadth * height;
        System.out.println("Volume of Cuboid is : " + Vol);
    }

    public VolumeOverloading(int radius, int height) {
        double Vol = 4 * 3.14 * radius * height;
        System.out.println("Volume of Cylinder is : " + Vol);
    }

    public static void main(String[] args) {

        VolumeOverloading volume1 = new VolumeOverloading(16);
        VolumeOverloading volume2 = new VolumeOverloading(10, 20, 30);
        VolumeOverloading volume3 = new VolumeOverloading(21, 70);

    }
}
