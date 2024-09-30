static void capitalizeWords(String source, String dest)
{
  try {
    FileOutputStream fos = new FileOutputStream(dest) ;
    FileInputStream fis = new FileInputStream(source) ;
    
    int content ; 
    boolean x = true ;
    while((content = fis.read()) != -1){
      
      if(x && Character.isLowerCase(content)){
        content = Character.toUpperCase(content) ;
      }
      fos.write(content) ; 
      if(Character.isWhitespace(content) || content == '-' || content == ','){
        x = true ;
      }
      else{
        x = false ;
      }
      
    }
    
    fos.close() ; 
    fis.close() ;
  }
  catch (IOException e){
    	System.err.println("An I/O error occurred: " + e.getMessage());
  }
}



Character.isWhitespace(content):

// This checks if the character is a whitespace character. Whitespace characters include spaces, tabs, and newlines. If content is any of these, this part of the condition will be true.
