import java.util.*;
import java.lang.*;
import java.io.*;

public class Problems{
	
	//Q.1: max and min in the array
	void problem1(){
	    int arr[] = {-1,0,3,6,8};
	    int max= arr[0];
	    int min= arr[0];
	    for(int i=0; i<=arr.length-1; i++){
	        if(arr[i]>max){
	            max=arr[i];
	        }
	        if(arr[i]<min){
	            min=arr[i];
	        }
	    }
	    System.out.println("Maximum value of the array is:"+max);
	    System.out.println("Minimum value of the array is:"+min);
	}
	
	
	//Q.2 Find unique elements of the array.
	// Input- arr[] = {1,3,5,1,3,2,3,2,6,7}
	//Output- 5 6 7
	void problem2(){
	    int arr[] = {1,3,5,1,3,2,3,2,6,7};
	    for(int i=0; i<=arr.length-1; i++){
	        int count=1;
	        for(int j=0; j<=arr.length-1; j++){
	            if(arr[i]==arr[j] && i!=j){
	                count++;
	            }
	        }
	       if(count==1){
	           System.out.print(arr[i]+" ");
	       }
	    }
	}
	
	//Q.3 sum of any 4 elements of the array(max and min).
	// Input- arr[] = {17,6,5,1,2}
	//Output- max sum of 4 numbers, min sum of 4 numbers
	void problem3(){
	    int sum=0;
	    int arr[] = {17,6,5,1,2};
	    int max=arr[0];
	    int min=arr[0];
	    for(int i=0; i<=arr.length-1; i++){
	        if(arr[i]>max){
	            max=arr[i];
	        }
	        if(arr[i]<min){
	            min=arr[i];
	        }
	        sum=sum+arr[i];
	    }
	    int min_sum=sum-max;
	    int max_sum=sum-min;
	   System.out.println("Minimum sum of 4 numbers: "+min_sum);
	   System.out.println("Maximum sum of 4 numbers: "+max_sum);
	}
	
	
}
