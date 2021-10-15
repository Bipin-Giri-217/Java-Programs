
import java.util.Scanner; // Import the Scanner class

public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username :");

        String userName = sc.nextLine(); // Read user input
        //Scanner rn = new Scanner(System.in);// no need to create new new object we can use above created object
        
        System.out.println("Enter Roll no. :");
        int roll_no = sc.nextInt();
        System.out.println("Username is: " + userName); // Output user input
        System.out.println("Roll no. is: " + roll_no); // Output user input
        sc.close();
    }
}
