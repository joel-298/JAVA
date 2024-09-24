package rotate_an_array;

import java.util.Scanner ; 

public class leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int k = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		// normalize : 
		k = k % n ;
		
		// main code : 
		reverseArray(arr,0,n-1) ;
		reverseArray(arr,0,k-1) ;
		reverseArray(arr,k,n-1) ;
		
		// printing
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ") ;
		}
	}
	
	public static void reverseArray(int [] arr, int starting, int ending) {
		while(starting < ending) {
			int temp = arr[starting] ;
			arr[starting] = arr[ending] ;
			arr[ending] = temp ; 
			starting++ ;
			ending-- ;
		}
	}
}
