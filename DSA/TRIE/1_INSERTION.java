// INSERTION IN A TRIE ! 
// TIME COMPLEXITY : O(L) 
// L = length of a word

import java.util.* ; 

class Node {
    public Node [] children ; 
    public boolean endOfWord ;
    
    public Node() {
        children = new Node [26] ; // 26
        for(int i = 0 ; i < 26 ; i++) {
            children[i] = null ; 
        }
        endOfWord = false ;
    }
}

class Trie {
    public Node root ; // creating default null root 

    public Trie () {
        root = new Node() ; 
    }
    
    // Insertion 
    public void Insert(String word) {
        Node current = root ; // local root for traversal 
        for(int i = 0 ; i < word.length() ; i++) {
            int index = word.charAt(i) - 'a' ; 
            // create node
            if(current.children[index] == null) {
                current.children[index] = new Node() ; 
            }
            // end of word 
            if(i == word.length() - 1) {
                current.children[index].endOfWord = true ; 
            }
            // traversal to next level
            current = current.children[index] ; 
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		String [] words = {"the","a","there","their","any"} ; 
		Trie t = new Trie() ; 
		for(int i = 0 ; i < words.length ; i++) {
		    t.Insert(words[i]) ;
		}
		System.out.println("Words inserted successfully !") ; 
		
	}
}