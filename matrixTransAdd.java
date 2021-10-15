import java.util.*;
public class matrixTransAdd {
    public static void main(String args[]){  
        
        int row,col;
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter no. of Rows : ");
        row=sc.nextInt();
        System.out.print("\nEnter no. of Columns : ");
        col=sc.nextInt();

        int A[][]=new int[row][col];
        int B[][]=new int[row][col];
        System.out.println("\nEnter matrix A");
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter element of mat A["+(i+1)+"]["+(j+1)+"] :  ");
                A[i][j]=sc.nextInt();
            }
        } 
        System.out.println("\nEnter matrix B");
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter element of mat B["+(i+1)+"]["+(j+1)+"] :  ");
                B[i][j]=sc.nextInt();
            }
        } 
        sc.close();
        int C[][]=new int[row][col];   
            
        System.out.println("\nResultant Matrix is :");
        for(int i=0;i<row;i++){    
        for(int j=0;j<col;j++){    
        C[i][j]=A[i][j]+B[i][j];      
        System.out.print(C[i][j]+" ");    
        }    
        System.out.println();  
        }  
        
        System.out.println("\nTranspose of Resultant Matrix i.e. matrix A + matrix B is :");
        for(int i=0;i<row;i++){    
            for(int j=0;j<col;j++){         
            System.out.print(C[j][i]+" ");    
            }    
            System.out.println();  
            }
        }
}
