import java.util.*;

//Q.1 Take input for the matrix and display the matrix.
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no. of rows");
	    int n = sc.nextInt();
	    System.out.println("Enter the no. of columns");
	    int m = sc.nextInt();
	    System.out.println("value of row "+ n);
	    System.out.println("value of column "+ m);
	    int mat[][] = new int[n][m];
	    System.out.println("Enter elements for the matrix.");
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	             mat[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("Printing the matrix.");
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            System.out.print(mat[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}

