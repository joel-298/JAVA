// KMP ALGORITHM : 


class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length() ; 
        int m = pat.length() ; 
        
        int [] lps = new int[m] ; 
        ArrayList<Integer> res = new ArrayList<>() ; 
        

        // STEP 1 : Build LPS ARRAY 
        lps[0] = 0 ;
        int i = 0 ; // i = pat
        int j = 1 ; // j = lps
        while(j < m) {
            if(pat.charAt(j) == pat.charAt(i)) {
                i++ ; 
                lps[j] = i ; 
                j++ ; 
            }
            else{
                if(i != 0) {
                    i = lps[i - 1] ;
                }
                else{
                    lps[j] = 0 ;
                    j++ ;
                }
            }
        }
        
        // STEP 2 : PATTERM MATCHING USING LPS Longest Prefix Suffix
        i = 0 ;  // txt = i 
        j = 0 ;  // pat = lps = j 
        while(i < n) {
            if(txt.charAt(i) == pat.charAt(j)) {
                i++ ; 
                j++ ; 
                if(j == m) {
                    res.add(i-j) ;
                    j = lps[j-1] ;
                }
            }
            else{
                if( j != 0) {
                    j = lps[j - 1] ;
                }
                else{
                    i++ ; 
                }
            }
            
        }
        return res ; 
    }
}