package package1;
import java.util.Scanner; ;
public class class_1 {

	public static void main(String[] args) {
		// DATA TYPES : 
		// PRIMITIVE DATA TYPE : byte, short, integer , long , float , double , character , boolean
		// NON PRIMITIVE DATA TYPE : strings, arrays, and classes
		
		// NUMBER SYSTEM : 
		
		//1) DECIMAL
		// 314 + 100 =>
		// 4+0 = 4 , 4%10 = 4 , carry forward = 0 , 4/10 = 0;
		// 1+0 = 1 , 1%10 = 1 , carry forward = 0 ; 1/10 = 0;
		// 3+1 = 4 , 4%10 = 4 , carry forward = 0 ; 4/10  therefore => 414
		// decimal to binary 
			Scanner sc = new Scanner(System.in) ;
			int n = sc.nextInt() ;
			int sum = 0 ; 
			int mul = 1 ;
			while(n>0) {
				int rem = n%2 ;
				sum += rem * mul ;
				n = n / 2 ;
				mul = mul*10;
			}
			System.out.println(sum) ;
		// binary to decimal
			int number = 0 ;
			int counter = 1 ;
			while(sum != 0) {
				int last = sum%10 ;
				number += last*counter ;
				counter = 2*counter; 
				sum /= 10 ;
			}
			System.out.println(number) ;
		// 415 + 517 =>
		// 5+7 = 12 , 12%10 = 2 , carry forward = 1 , 12/10 = 1;
		// 1+1+1 = 3 , 3%10 = 3 , carry forward = 0 ; 3/10 = 0;
		// 4+5 = 9 , 9%10 = 9 , carry forward = 0 ; 9/10  therefore => 932
		
		
		// 2) BINARY 
		
		// 3) HEXA DECIAL 0-16 digits : 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E
		
		// 4) OCAT DECIMAL 0-8 digits : 0,1,2,3,4,5,6,7
			System.out.println("OCAT DECIMAL 0-8 digits :") ;
			int a = 054 ;// if we write 0 in front of any number in java then compiler converts it into octal , the digits of the rest of the numbers should be between 0-7 only
			System.out.println(a) ;
			
			
			
		//5) RANGE OF NUMBERS : TYPECAST
			System.out.println("RANGE OF NUMBERS : TYPECAST") ;
			// byte i = 140 ; // will give error because its out of range 
			byte i = (byte)140 ;
			System.out.println(i) ; // therefore output = -116 
				// convert 140 to binary 
			    // 10001100 => reverse its digits and add 1 => 01110011 + 1 => 01110100 now convert this to decimal => 116 ; 
			    // -116 because 140's binary numbers's first digit is 1 ;
			
			byte j = (byte)400 ;
			System.out.println(j) ;
			// 100101100 => reverse its digits and add 1 => {011010011(its 9 digits therefore remove the 1st)}
			// Decimal Value of Truncated Bits:
			// The binary value 00101100 is equivalent to the decimal value 44.
			
//			for(byte i = 0 ; i <= 129 ; i++) { // 129 greater than byte range : 
//				System.out.println(i) ; // first we will print from 0 to 127 then at 128 the number will convert it into byte and then through the typecase i will become -128
//										// then the next iteration will be for -127 and this will go on for infinite iteration 
//			}
			
			
//			in case of long 
			long m = 823745293847923873l ;
			
			System.out.println(m) ;
			// in case of float 
			float M = (float)8.7 ;
			System.out.println(M); 
			
			// in case of character
			char ch = 'A' ;
			ch++ ;
			System.out.println(ch) ;
			System.out.println((int)ch);
			
 

		
		
		
		
	}

}
