import java.util.Scanner;	//importing scanner class
public class Odd_Even {
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter a no.:  ");	//input - range to classify no.'s
	    int n=sc.nextInt();		//taking input for that variable
	    for (int i=0;;i++){
	        if(i>n){	//is to iterate loop only till condition
	            break;
	        }
	        else{
	            if(i%2==0){		//is used to print only even no.'s
	                System.out.println(i+" is Even ");
	                continue;	//if its even then it will continue loop again by incrementing i
	            }
	            else{		//if condition is not satisfied then this statement will execute
	                System.out.println(i+" is Odd ");
	           }
	        }
	    }
		sc.close();
	}
}