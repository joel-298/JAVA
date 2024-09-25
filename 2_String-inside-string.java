// for example if have to print this in output : 
// Hello my name is "Joel" matthew . 

// then we will use this syntax : 
// System.out.println("Hello my name is \"Joel\" matthew");


// MAIN MOTIVE OF THIS CODE IS TO KNOW WHEN TO USE THESE ..... 
class HelloWorld {
    public static void main(String[] args) {
        String name = "JOEL" ;
        System.out.println("Hello my name is "+name);
        System.out.println("Hello my name is \""+name+"\"");
        
        double x = 20 ;
        double X = 20.18734123 ;
        System.out.println(x) ;
        System.out.println(X) ;
        
        System.out.println("we are converting this double into string "+String.format("%.3f",X));
        System.out.print("we are not converting this double into string: ");
        X = Math.round(X*1000.0)/1000.0 ; // now instead of X storing  20.18734123 // it will store this number upto 3 decimal digits ....
        System.out.print(X);
    }
}



// OUTPUT OF THIS CODE : 
// Hello my name isJOEL
// Hello my name is "JOEL"
// 20.0
// 20.18734123
// we are converting this double into string 20.187
// we are not converting this double into string: 20.187
// === Code Execution Successful ===