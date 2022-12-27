public class Problems{
	
	//Q.1
	//Output
	// * * * * *
	// * * * *
	// * * * 
	// * *
	// *
	void problem1(){
	    int n=5;
	    for(int i=1; i<=n; i++){
	        for(int j=0; j<=n-i; j++){
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	}
	
	//Q.2
	// input n=6;
	// Output
	// 1
	// 2 7
	// 3 8 12
	// 4 9 13 16
	// 5 10 14 17 19
	// 6 11 15 18 20 21
	void problem2(){
	    int n=6;
	    for(int i=1; i<=n; i++){
	        int x = i;
	        int y = n-1;
	        for(int j=1; j<=i; j++){
	            System.out.print(x+" ");
	            x = x+y;
	            y--;
	        }
	        System.out.println();
	    }
	}
	
	//Q.3
	// input n=4;
	// Output
	// * * * *
	// *     *
	// *     *
	// * * * *
	void problem3(){
	    int n=6;
	    for(int i=0; i<n; i++){
	        for(int j=0; j<n; j++){
	            if(i==0 || i==n-1){
	                System.out.print("*"+" ");
	            }else if(j==0 || j==n-1){
	                System.out.print("*"+" ");
	            }else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}
	
	//Q.4
	// input n=5;
	// * * * * *
	// *     *
	// *   *
	// * *
	// *  
	void problem4(){
	    int n=5;
	    for(int i=1; i<=n; i++){
	        for(int j=0; j<=n-i; j++){
	            if(i==1 ){
	                System.out.print("*"+" ");
	            }else if(j==0){
	                System.out.print("*"+" ");
	            }else if(j==n-i){
	                System.out.print("*"+" ");
	            }else{
	                System.out.print("  ");
	            }
	        }    
	        
	        System.out.println();
	    }
	}
	
	//Q.5
	//         *
	//       * * *
	//     * * * * * 
	//   * * * * * * *
	// * * * * * * * * *
	void problem5(){
	    int n=5;
	    for(int i=0; i<n; i++){
	        for(int j=0; j<n-i; j++){
	            System.out.print(" "+" ");
	        }
	        for(int k=0; k<=i; k++){
	            System.out.print("*"+" ");
	        }
	        for(int l=1; l<=i; l++){
	            System.out.print("*"+" ");
	        }
	        
	        System.out.println();
	    }
	}
	
	//Q.6  n=5;
	// * * * * * * * * *
	//   * * * * * * *
	//     * * * * *      
	//       * * *
	//         *
	void problem6(){
	    int n=5;
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<i; j++){
	            System.out.print(" "+" ");
	        }
	        for(int k=0; k<=n-i; k++){
	            System.out.print("*"+" ");
	        }
	        for(int l=1; l<=n-i; l++){
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	}
	
	//Q.7  n=5;
	// * * * * * * * * *
	//   *           *
	//     *       *     
	//       *   *
	//         *
	void problem7(){
	     int n=5;
	     for(int i=0; i<n; i++){
	         for(int j=0; j<2*n-1; j++){
	             if(i==0){
	                 System.out.print("*"+" ");
	             }else if(i==j){
	                 System.out.print("*"+" ");
	             }else if(j==2*n-2-i){
	                 System.out.print("*"+" ");
	             }else{
	                 System.out.print(" "+" ");
	             }
	         }
	         System.out.println();
	     }
	}
	
//Q.8
//Output
// 	     1 
//     2 1 2 
//   3 2 1 2 3 
// 4 3 2 1 2 3 4 
//   3 2 1 2 3 
//     2 1 2 
//       1 
	void problem8(){
	    int n=7;
	    int s=n/2;
	    for(int i=1; i<=s+1; i++){
	        for(int j=0; j<=s-i; j++){
	            System.out.print(" "+" ");
	        }
	        for(int k=i; k>0; k--){
	            System.out.print(k+" ");
	        }
	        for(int l=2; l<=i; l++){
	            System.out.print(l+" ");
	        }
	        System.out.println();
	    }
	    for(int i=1; i<=s+1; i++){
	        for(int j=0; j<i; j++){
	            System.out.print(" "+" ");
	        }
	        for(int k=s+1-i; k>0; k--){
	            System.out.print(k+" ");
	        }
	        for(int l=2; l<=s+1-i; l++){
	            System.out.print(l+" ");
	        }
	        System.out.println();
	    }
	}
	
}
