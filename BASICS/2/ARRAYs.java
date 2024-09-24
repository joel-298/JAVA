package package1;

public class ARRAYs {

	public static void main(String[] args) {
		// 2000(lets assume the base address) + 4(type = int)*2(2nd index)
		// initial defalut value of array is ZERO
		int [] arr = new int[5] ;
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(arr[i]+" ") ;
		}
		System.out.println();
		
		int [] brr = {3,5,1,7,8} ;
		System.out.println(brr[0]+" "+brr[1]);
		Swap(brr[0],brr[1]) ;
		System.out.println(brr[0]+" "+brr[1]) ;
	}
	
	public static void Swap(int a, int b) {
		int temp = a ;
		a = b ; 
		b = temp ;
	}

}
