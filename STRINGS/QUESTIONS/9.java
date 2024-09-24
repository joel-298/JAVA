// QUESTION : 9 
// LEETCODE : 2288

class Solution {
    public String discountPrices(String sentence, int discount) {
        sentence = sentence.trim() ;
        String [] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder() ;

        for(int i = 0 ; i < words.length ; i++){
            String temp = words[i] ; 
            if(!temp.matches(".*\\d.*")){ // these is no digit in the word[i]
                result.append(words[i]) ;
            }
            else{
                if(temp.charAt(0) == '$'){
                    if(!temp.substring(1).matches(".*[^0-9].*") ){
                        // Convert the substring to double
                        double price = Double.parseDouble(temp.substring(1));
                        // Apply the discount
                        double discountedPrice = price * (1 - discount / 100.0);
                        // Append formatted discounted price
                        result.append(String.format("$%.2f", discountedPrice));
                    
                    }
                    else{   
                        result.append(temp) ; 
                    }
                }  
                else{
                    result.append(temp);
                }
                    

            }

            // base case of space 
            if(i < words.length -1 ){
                result.append(" ");
            }
        }
        return result.toString() ;
    } 
}