// FILE CLASS : 


import java.io.* ;                             // (7)
import java.io.File ;                          // (6)
import java.io.IOException ;                   // (1) 

public class Main{
    public static void main(String[] args){
        File file = new File("G-10");

        try{
            if(file.createNewFile()){ // (5)
                System.out.println("File Created") ;
            }
            else{
                System.out.println("File already exisits") ;
            }
            System.out.println(file.getAbsolutePath()); // (3)
            System.out.println(file.getPath()) ;        // (4)
        } catch (IOException e) {
            e.printStackTrace() ;  // (2) 
        }       
    }
}


// EXPLANATIONS: 
// (1) ------- unlike normal EXCEPTION in Error handeling , we have to import IOExceptino in case of try/catch for FILE HANDELING 
// (2) ------ We do use printStackTrace to console error in the form of error except printing the message that we can generate while giving error i.e (e.getMessage())
// (3) ------ Will give path like this 'C/:/desktop/etc etc ... '
// (4) ------- Will give path like this '/G-10' ;
// (5) ------ Used to create File , and if already exists then it will run else condition
// (6) ------ Imports FILE class 
// (7) ------ Imports everything related to FileSystem and INPUT STREAM ...... (i.e I/O stream)
//              java.io package: This package contains classes related to input and output operations (I/O), such as reading from and writing to files, working with streams, and handling exceptions related to I/O.
//              File , FileReader: For reading character files. , BufferedReader: For efficient reading of text from character input. , IOException: For handling input/output exceptions.