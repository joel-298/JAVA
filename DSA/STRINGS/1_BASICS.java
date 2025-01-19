import java.util.* ; 

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		String s = sc.nextLine() ;  // input also includes spaces
		s.trim() ; 
		String [] arr = s.split("\\s+") ; 
		for(int i = 0 ; i < arr.length ; i++) {
		    String temp = arr[i] ; 
		    if(temp.matches(".\\d.")){
		        System.out.println("Contains digits") ; 
		    }
		    if(temp.matches(".[a-z].")) {
		        System.out.println("Contains Lower Case") ; 
		    }
		    if(temp.matches(".[A-Z].")) {
		        System.out.println("Contains Upper Case") ;
		    }
		    if(temp.matches(".[^a-zA-Z0-9].")) {
		        System.out.println("Contains Special Character") ; 
		    }
		    if(temp.equals("JOEL")) {
		        System.out.println("JOEL FOUND") ;
		        break ;
		    }
		    
		}
		System.out.println(arr.length) ; 
	}
}





// STRINGS IMPORTANT POINTS : 
// 1) STRING BUILDER 
// 2) STRING ALGORITHMS 
		// MANACHERS
		// KMP 
// 3) TRIE 
// 4) PREFIX - SUFFIX 
// 5) SUBSTRING : 
		// prefix of all suffix 
		// suffix of all prefix 