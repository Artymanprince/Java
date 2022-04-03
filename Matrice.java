package Matrice;
import java.util.Scanner;
public class Matrice {
	public static void main(String args[]){
 Scanner matrice = new Scanner(System.in);
 /*matrice is the scanner object that we want to store our data input*/
	System.out.println("Input number of rows:  ");
	int row = matrice.nextInt();
	System.out.println("Input number of columns: ");
	int column = matrice.nextInt();
	if (row!=column){
	  System.out.println("The number of rows should equal the number of columns. ");
	  System.exit(0);
	  /*You must know that for one to do matrice multiplication, matrice A's Rows must equal matrice B's columns*/
		}
	
	int A[][] = new int[row][column];
	/*I created an array to hold the row values which user will input as well as column array.*/
   int B[][] = new int[row][column];
   int C[][] = new int [row][column]; 
   System.out.println("Enter value (row wise) of matrice A");
   for (int i=0; i<row; i++) {
     for (int j=0; j<column; j++) {
       A[i][j] = matrice.nextInt();
       //i is row, j is column. 
    		 }
  	 }
  	
  	System.out.println("Enter value (row wise) of matrice B");
   for (int i=0; i<row; i++) {
     for (int j=0; j<column; j++) {
       B[i][j] = matrice.nextInt();
       
           }
        }
        
   for (int i=0; i<row; i++) {
     for (int j=0; j<column; j++) {
         for (int k=0; k<row; k++) {
          C[i][j] = C[i][j]+A[i][k]*B[k][j];
          
     		   }
      	  }
        }
        
        System.out.println("The product of the two matrices is: ");
        for (int i=0; i<row; i++) {
          for (int j=0; j<column; j++) {
          System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        matrice.close();
     } 
}

