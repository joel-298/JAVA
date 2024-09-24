// CONVERSIONS : A) INTEGER TO STRING 
//               B) STRING TO CHAR ARRAY 
//               C) STRING TO INTEGER 




// CONVER INTEGER TO STRING : 
int number = 42;

// 1. Using Integer.toString()
String str = Integer.toString(number);

// 2. Using String concatenation
String str = number + "";  // Concatenating with an empty string   -------------------> HIGLY PREFERED

// 3. using toString
public class Main{
    public static void main(String[] args){
        int n = 10 ;
        String s = toString(n) ; 
    }
    public static String toString(int n) {
        return n+"";
    }
}

// 4. Using StringBuilder
StringBuilder sb = new StringBuilder();
sb.append(number);
String str = sb.toString();

// 5. Using String.valueOf()                  //----------> NOT PREFERED
String str = String.valueOf(number);

// 6. Using String.format()                  //------------> NOT PREFERED
String str = String.format("%d", number);




// CONVER STRING TO CHARACTER ARRAY : 
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char [] array = str.toCharArray() ;
        
        // NORMAL PRINTING  :
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ") ;
        }
        System.out.println() ; 
        // FOR EACH :
        for(char c: array){
            System.out.print(c+" ") ;
        }
                                                                        // Output:
                                                                        // H e l l o ,   W o r l d !
                                                                        // H e l l o ,   W o r l d !
    }
}


// CONVERT STRING TO INTEGER 
public class Main {
    public static void main(String[] args) {
        String str = "123";
        int num1 = Integer.parseInt(str);  // Convert String to int         // METHOD 1 : parseInt             // CHOOSE ANY ONE : 
        int num2 = Integer.valueOf(str);  // Convert String to int          // METHOD 2 : valueOf
        System.out.println(num);  // Output: 123
    }
}