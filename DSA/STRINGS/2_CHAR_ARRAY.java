public class ReplaceCharacterInString {
    public static void main(String[] args) {
        // Original string
        String original = "This is a simple string with i's.";
        
        // Step 1: Convert the string to a character array
        char[] charArray = original.toCharArray();
        
        // Step 2: Replace all 'i' with 'I' in the character array
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'i') {
                charArray[i] = 'I';
            }
        }
        
        // Step 3: Convert the character array back to a string
        String modified = new String(charArray);
        
        // Print the result
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
    }
}
