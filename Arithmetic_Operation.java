public class Arithmetic_Operation {
    public static void main(String[] args) {
        
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        
        System.out.println("Addition is : " + (a+b));
        System.out.println("Subtaction is : " + (a-b));
        System.out.println("Multiplication is : " + (a*b));
        System.out.println("Division is : " +(float) (a/b));

    }
}
