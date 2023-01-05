import java.util.*;

//Q.1 Addition of the two matrix.
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int mat1[][] = new int[r][c];

		int mat2[][] = new int[r][c];
		
		System.out.println("Enter the 1st matrix");
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		        mat1[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Enter the 2nd matrix");
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		        mat2[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("First matrix is:");
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		         System.out.print(mat1[i][j]+" ");
		    }
		    System.out.println();
		}
		
		System.out.println("Second matrix is:");
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		         System.out.print(mat2[i][j]+" ");
		    }
		    System.out.println();
		}
		
	    System.out.println("Addition of the given two matrix is:");
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		         System.out.print(mat1[i][j]+mat2[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}



