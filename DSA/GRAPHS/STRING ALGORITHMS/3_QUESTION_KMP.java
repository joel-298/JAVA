// STRING MATCHING LEETCODE : 1408

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>() ; 
        Arrays.sort(words,(a,b)->a.length() - b.length()) ;

        for(int k = 0 ; k < words.length ; k++) {
            String pat = words[k] ; 
            int m = pat.length() ; 
            // create lps ; 
            int [] lps = new int[m] ; 
            int i = 0 , j = 1 ; 
            while(j<m) {
                if(pat.charAt(i) == pat.charAt(j)) {
                    i++ ; 
                    lps[j] = i ; 
                    j++ ; 
                }
                else{
                    if(i!=0) {
                        i = lps[i-1] ; 
                    }
                    else{
                        j++ ; 
                    }
                }
            }
            for(int l = k+1 ; l < words.length ; l++) {
                String txt = words[l] ; 
                int n = txt.length() ; 
                // kmp 
                i = 0 ; j = 0 ; 
                while(i<n) {
                    if(txt.charAt(i)==pat.charAt(j)) {
                        i++ ; j++; 
                        if(j==m) {
                            if(result.contains(pat)) {
                                break ; 
                            }
                            else{
                                result.add(pat) ; 
                                break ;
                            }
                        }
                    }
                    else{
                        if(j!=0) {
                            j = lps[j-1] ; 
                        }
                        else{
                            i++ ;
                        }
                    }
                }
            }
        }

        return result ; 
    }
}



// STEPS : 
// 1) Sort array of string in ascending orderd based on length so pattern length < text length 
// 2) Use loop : pattern with rest of the array
// 3) even if pattern matches with any one using KMP add in result and break 
// 4) Update pattern to next index create new pattern lps 
// 5) then start comparing from new pattern index + 1 
