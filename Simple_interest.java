public class Simple_interest {
    public static void main(String[] args) {
        int p;
        float t;
        float r;
        p=5000;
        t=2.5f;
        r=4.5f;
        //passing argument while running in cmd
        // p=Integer.parseInt(args[0]);
        // t=Float.parseFloat(args[1]);
        // r=Float.parseFloat(args[2]);
        System.out.println("simple interest is "+ (p*r*t)/100);

    }
}
