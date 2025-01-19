// TIME COMPLEXICITY : O(n)

class Solution {
    public String longestPalindrome(String s) {
        // 1) Initilization of string !
        int n = s.length()  ;
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (char c : s.toCharArray()) {
            sb.append(c);
            sb.append('#');
        }
        String newString = sb.toString();

        // 2) Initilization of pointers ! 
        int p[] = new int[2*n+1] ;
        int center = 0 , right = 0 ; 
        int L_Length = 0 ; int L_Center = 0 ; 

        // 3) Loop 
        for(int i = 0 ; i < newString.length() ; i++) {
            int mirror = 2 * center - i ; 
            if(right > i) { 
                p[i]=Math.min(p[mirror],right-i) ;
            }
            int a = i + (p[i]+1) ;
            int b = i - (p[i]+1) ;
            while(b >= 0 && a < newString.length() && newString.charAt(a) == newString.charAt(b)) {
                b-- ; 
                a++ ; 
                p[i]++ ;
            }
            if(p[i] >= L_Length) {
                L_Center = i ; 
                L_Length = p[i] ;
            }
            if(i+p[i] > right) {
                center = i ; 
                right = i + p[i] ; 
            }
        }
        // 4) Return also remove the '#' ! 
        StringBuilder result = new StringBuilder();
        for (int i = L_Center - L_Length; i <= L_Center + L_Length; i++) {
            if (newString.charAt(i) != '#') {
                result.append(newString.charAt(i));
            }
        }
        return result.toString();
    }
}