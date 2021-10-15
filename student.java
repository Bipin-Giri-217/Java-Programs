import java.util.Scanner;
class student
 {  static void displayRecord(String name,int rno,int mks){
    System.out.println("Name is : "+ name);
    System.out.println("Roll no. is : "+rno);
    System.out.println("Marks is : "+mks);
    }
     static void insertRecord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
       String name = sc.nextLine();
       
        System.out.println("Enter roll no. :");
       int  rollno =sc.nextInt();
        
        System.out.println("Enter your marks : ");
       int marks = sc.nextInt();
        student.displayRecord(name,rollno,marks);
        sc.close();
     }

    public static void main(String[] args) 
	{ 
		System.out.println(" ");
   	 
    //student obj = new student();
    student.insertRecord();
    }
 }
