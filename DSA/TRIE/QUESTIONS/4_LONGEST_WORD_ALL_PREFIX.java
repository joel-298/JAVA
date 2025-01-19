// LONGEST WORD WITH ALL PREFIXES 
// words = ["a","banana","app","aapl","apply","apple"]
// ans = "apple"

import java.util.* ; 

class Node {
    public Node [] children ; 
    public boolean endOfWord ; 
    public Node() {
        children = new Node() ; 
        for(int i = 0 ; i < 26 ; i++ ){
            children[i] = null ; 
        }
        endOfWord = false ; 
    }
}
class Trie {
    public Node root ; 
    public Trie { 
        root = new Node() ; 
    }
    public void INSERT(String word) {
        Node current = root ; 
        for(int i = 0 ; i < word.length() ; i++) {
            int index = word.charAt(i) - 'a' ; 
            if(current.children[index] == null) {
                current.children[index] = new Node() ; 
            }
            if( i == word.length() - 1 ) {
                current.children[index] = true ;
            }
            current = current.children[index] ; 
        }
    }
    public void  longestWordWithAllPrefixes(Node root, StringBuilder temp) {

    }
}
public class Main{ 
    public static void main(String[] args) {
        Trie t = new Trie() ; 
        String[] words = {"a","banana","app","aapl","ap","aaply","apple"} ; 
        for(int i = 0 ; i < words.length() ; i++) {
            t.INSERT(words[i]) ; 
        }
        StringBuilder result = new StringBuilder("") ; 
        t.longestWordWithAllPrefixes(t.root,result) ; 

        System.out.println(answer) ; 
    }
}