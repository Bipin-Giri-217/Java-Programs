import java.util.Scanner;

    class person{
        Scanner sc=new Scanner(System.in);
        void essntl_dtl(){
            int ID;
            String name;
            System.out.print("\nEnter Employee ID : ");
            ID=sc.nextInt();
            sc.nextLine();
            System.out.print("\nEnter Employee Name : ");
            name=sc.nextLine();
        }

    }
    class Employee extends person{
        void dpt_dtl(){
            String Department;
            int salary;
            System.out.print("\nEnter your Department : ");
            Department=sc.nextLine();
            System.out.print("\nEnter your Salary : ");
            salary=sc.nextInt();
        }
    }
    class Teacher extends Employee{
        void subj(){
            String subject;
            System.out.print("\nEnter your Subject : ");
            subject=sc.nextLine();
        }
public class Multilvl_inheritance {

    public static void main(String[] args) {
        Teacher Tchr = new Teacher();
        
        Tchr.essntl_dtl();
        Tchr.dpt_dtl();
        Tchr.subj();
    }
}
}