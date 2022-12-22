import java.util.*;
import java.lang.*;
import java.io.*;

public class Problems
{
    //Output 
    // * * * *
	void problem1(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        System.out.print("*"+" ");
	    }
	}
	
	//Output
	// * * * 
	// * * *
	// * * *
	void problem2(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n= sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n; j++){
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	}
	
	//Output
	// *
	// * *
	// * * * 
	// * * * *
	// * * * * *
	void problem3(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=i; j++){
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	}
	
	//Output
	//         *
	//       * *
	//     * * *
	//   * * * *
	// * * * * *
	void problem4(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n-i; j++){
	            System.out.print(" ");
	        }
	        for(int k=1; k<=i; k++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	//Output
	//      *
	//     * *
	//    * * *
	//   * * * *
	//  * * * * *
	void problem5(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n-i; j++){
	            System.out.print(" ");
	        }
	        
	        for(int k=1; k<=i; k++){
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	}
	
	//Output
	// 1
	// 2 2
	// 3 3 3
	// 4 4 4 4
	void problem6(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=i; j++){
	            System.out.print(i+" ");
	        }
	        System.out.println();
	    }
	}
	
	//Output
	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	void problem7(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=i; j++){
	            System.out.print(j+" ");
	        }
	        System.out.println();
	    }
	}
	
	//Output
	//1
	//2 3
	//4 5 6
	//7 8 9 10
	void problem8(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    int count=0;
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=i; j++){
	            count++;
	            System.out.print(count+" ");
	        }
	        System.out.println();
	    }
	}
	
	void problem9(){
	    System.out.println("Hiii");
	}
}
