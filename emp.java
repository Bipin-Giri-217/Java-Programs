// read this first for taking inputs from user 
//https://stackoverflow.com/questions/26626106/why-string-inputs-after-integer-input-gets-skipped-in-java
import java.util.Scanner;

class employee {
    Long empid;
    String empname;
    String designation;
    int salary;

    void Employe() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id:");
        empid = sc.nextLong();
        //Another way would be to always use nextLine wrapped into a Integer.parseInt:
        // System.out.println("Enter id");

        // empid = (long) Integer.parseInt(sb.nextLine());

        sc.nextLine();   //use this to skip the newline character 

        System.out.println("Enter your Name: ");
        empname = sc.nextLine(); // or use next method to accept string so that it won't skip this 
        // here if we use nextLine() then this will take enter as input and skips this 

        System.out.println("Enter your designation: ");
        designation = sc.nextLine();

        System.out.println("Enter your Salary: ");
        salary = sc.nextInt();

        grade(salary);

        sc.close();
    }

    void grade(int salary) {
        this.salary = salary;
        if (salary >= 100000) {

            System.out.println("Your Grade: A");
        } else if (salary >= 80000) {

            System.out.println("Your Grade: B");
        } else if (salary >= 500000) {

            System.out.println("Your Grade: C");
        } else {

            System.out.println("Your Grade: D");
        }

    }

    void details(long id, int sal, String nam, String desi) {
        System.out.println("Your employee id: " + id);

        System.out.println("Your Name: " + nam);

        System.out.println("Your Designation: " + desi);

        System.out.println("Your Salary: " + sal);
    }
}

public class emp {
    public static void main(String args[]) throws Exception {
        employee emp = new employee();
        emp.Employe();

    }

}
