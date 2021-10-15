import java.util.Scanner; // Import the Scanner class

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,temp;       //declaring vaiables
        int b=1;
        Scanner len =new Scanner(System.in);
        System.out.print("Enter a range upto which you have to print fibonacci no.'s :   ");
        int length =len.nextInt();
        len.close();
        //System.out.println(a);
        for(int i=1;i<=length;i++){  //iterate till length
            System.out.println(a);
            temp=a;                 //swaping  and updating value
            a=b;
            b=temp+b;
        }
        
    }
    
}
