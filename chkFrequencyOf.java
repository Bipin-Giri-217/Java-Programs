import java.util.*;

public class chkFrequencyOf {
    public static void main(String[] args) {
        int digits = 0, spaces = 0, symbols = 0, upper = 0, lower = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } 
            else if (ch >= '0' && ch <= '9')
                ++digits;
            else if (ch == ' ')
                ++spaces;
            else
                ++symbols;
        }
        System.out.println(" no. of digits : " + digits);
        System.out.println(" no. of spaces : " + spaces);
        System.out.println(" no. of special symbols : " + symbols);
        System.out.println(" no. of upper case letters : " + upper);
        System.out.println(" no. of lower case letters : " + lower);

    }
}
