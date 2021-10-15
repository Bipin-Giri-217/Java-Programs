import java.util.Scanner;  
public class ArrayMaxMin {
      
    public static void main(String[] args)   
    {  
    int n,max,min;  
    Scanner sc=new Scanner(System.in);  
    System.out.println("\nEnter the number of elements you want to store: ");   
    n=sc.nextInt();  
    
    
    int[] array = new int[n];  
    System.out.print("\nEnter the elements of the array: ");  
    for(int i=0; i<n; i++)  
    {  
        array[i]=sc.nextInt();  
    } 
    sc.close();
    max=array[0]; 
    min=array[0]; 
    for (int i=0; i<n; i++)   
    {  
    if(max<array[i]){
        max=array[i];
    }
    if(min>array[i]){
        min=array[i];
    }
    }  
    System.out.print("\n max is : "+max +"\t min is : "+min); 
    }
}
