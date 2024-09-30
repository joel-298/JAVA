// FILE INPUT STREAM : 


// This program demonstrates how to WRITE and READ data from a file in Java using "FileOutputStream" and "FileInputStream". 
// The code writes a string "G10 Class, Chitkara University" to a file named "G10.txt", and then reads the content of this file character by character, 
// printing each one to the console.



import java.io.* ;          
import java.io.File ; 
import java.io.IOException ; 


public class Main {
    public static void main(String[] args){
        String path = "G10.txt" ;
        File file = new File(path) ;
        
        // CREATION AND WRITING
        try {
            FileOutputStream obj = new FileOutputStream(file) ;     //(1)
            String temp = "Hello this is Joel Matthew" ;     
            obj.write(temp.getBytes()) ;                            //(2)
            obj.close() ;                                           //(3)
        } 
        catch (FileNotFoundException e){
            throw new RuntimeException(e) ;
        }
        catch (IOException e){
            throw new RuntimeException(e) ;
        }


        // READING 
        try {
            FileInputStream obj = new FileInputStream(file) ;       //(4)
            int content = obj.read();                            // (6)
            while(content != -1){                                //(5)                  
                System.out.println((char)content) ;                 //(7)
            }
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e) ;
        }   
        catch (IOException e){
            throw new RuntimeException(e) ;
        }
    }
}




// EXPLANATION : 

//   CREATION AND WRITING : 
//        (1) A FileOutputStream object is created. This opens the file for writing. If the file doesn't exist, it will be created.
//        (2) The write() method writes the string to the file AS A SEQUENCE OF BYTES using getBytes(). This converts the STRING INTO BYTE FORM, as files STORES DATA IN BYTES.
//        (3) The file output stream is closed after writing. This is important to free system resources.

//   READING : 
//        (4)  A FileInputStream object fis is created to read the file's contents. This opens the file in read mode.
//        (5)  A while loop is used to read the file character by character until the end of the file (indicated by -1).
//        (6)  This reads one letter or symbol from the file and stores it in a variable called content.  (ASCII VALUE)
//        (7)  This takes that letter or symbol, changes it from a number to an actual letter, and then prints it on the screen.

//   EXCEPTION : 
//       (FileNotFoundException e) :  This block catches exceptions if the file is not found.
//       (IOException e)           :  This block catches any other input/output exceptions during reading.