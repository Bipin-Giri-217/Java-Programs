import java.util.Scanner;
class Person{
    void id(int id){
        System.out.println("\nID: " + id);
    }
    void name(String name){
        System.out.println("Name: " + name);
    }
}
class employee extends Person{
    void department(String dprt){
        System.out.println("Department: "+ dprt);
    }
    void salary(int slry){
        System.out.println("Salary: " + slry );
    }
}
class Teacher extends employee{
    void subject(String subj){
        System.out.println("Subject: "+ subj);
    }

}

public class multi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int ID;String name;
            System.out.print("\nEnter Employee ID : ");
            ID=sc.nextInt();
            sc.nextLine();
            System.out.print("\nEnter Employee Name : ");
            name=sc.nextLine();
            String Department;
            int salary;
            System.out.print("\nEnter your Department : ");
            Department=sc.nextLine();
            System.out.print("\nEnter your Salary : ");
            salary=sc.nextInt();
            String subject;
            sc.nextLine();
            System.out.print("\nEnter your Subject : ");
            subject=sc.nextLine();
        Teacher sb = new Teacher();
        sb.id(ID);
        sb.name(name);
        sb.department(Department);
        sb.salary(salary);
        sb.subject(subject);
        sc.close();
    }
    
}
