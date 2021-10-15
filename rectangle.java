import java.util.Scanner;
public class rectangle {
    static void parameter(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length : ");
        int length =sc.nextInt();
        System.out.println("Enter width : ");
        int width =sc.nextInt();
        rectangle.Area(length , width);
        sc.close();
    }
    static void Area(int length,int width){
        System.out.println("length: "+ length + " and width: " + width);
        System.out.println("Area is :" + length*width);
    }
    public static void main(String[] args) {
        rectangle.parameter();
    }
    
}
