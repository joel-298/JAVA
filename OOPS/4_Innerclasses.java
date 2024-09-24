// INNER CLASSES :

// OUTSIDE CLASSES CANNT BE STATIC : only INNER CLASSES can be STATIC 



// // CASE 1 : 
// public class INNERCLASS { 
//     class TEST { 
//         String name ; 

//         public TEST(String name){
//             this.name = name ; 
//         }
//     }
//     public static void main(String[] args){
//         Test a = new Test("JOEL") ; 
//         Test b = new Test("KASHISH") ; 
//         System.out.println(a.name) ; 
//         System.out.println(b.name) ; 
//     }
// }   
// ------------------------------------------------> OUTPUT : KASHISH  // because it was dependent but in CASE 3 the output will be different
//                                                            KASHISH


// CASE 2 
// class TEST { 
//     String name ; 

//     public TEST(String name){
//         this.name = name ; 
//     }
// }
// public class INNERCLASS { 
//     public static void main(String[] args){
//         Test a = new Test("JOEL") ; 
//         Test b = new Test("KASHIS") ; 
//          System.out.println(a.name) ; 
//          System.out.println(b.name) ; 
//     }
// }   


// CASE 3 

public class INNERCLASS {
    static class TEST{
        String name ; 
        public TEST(String name) {
            this.name = name ; 
        }
    }

    public static void main(String[] args){
        TEST a = new TEST("JOEL") ; 
        TEST b = new TEST("KASHISH") ; 
        System.out.println(a.name) ;                   // --------> "JOEL"
        System.out.println(b.name) ;                   // --------> "KASHISH"
    }
}





// EXPLANATINOS  : 
// CASE 1 : will not work  BECAUSE Test class is itself dependent on the outer class i.e 
//                 in simple terms : since TEST class is not a static i.e it is dependent i.e 
//                 to run the class of TEST we have to create a object of INNERCLASS 
// IT WILL WORK FOR CASE 2 : 
// and it will also work for CASE 3 when we have written static in front of class TEST becuase now it is independent of class INNERCLASS

// CASE 3 : TEST objects have different value of object because it is independent from INNERCLASS ,
//           if we create objects of INNERCLASS and the value of objects of INNERCLASS will have same value becuase TEST class is STATIC 
//           BUT inside of TEST CLASS objects will have different values becuas they are not static