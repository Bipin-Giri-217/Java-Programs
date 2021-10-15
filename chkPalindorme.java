import java.util.Scanner;

public class chkPalindorme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        StringBuffer str1 = new StringBuffer(sc.nextLine());
        StringBuffer str2 = new StringBuffer(str1);
        str2.reverse();
        sc.close();
        // System.out.println(str1);
        // System.out.println(str2);

        //if (str1.compareTo(str2) == 0) {
            if((str1.toString()).equalsIgnoreCase(str2.toString())){ //compare without considering cases
            // if(str1.equals(str2)){
            System.out.println(str1 + " is Palindrome.");
        } else {
            System.out.println(str1 + " is Not a Palindrome.");
        }
    }
}