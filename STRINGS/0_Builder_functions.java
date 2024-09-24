public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a new StringBuilder instance
        StringBuilder sb = new StringBuilder("Hello");

        // Append text to the StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text at a specific position
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        // Replace part of the text
        sb.replace(6, 16, "Amazing");
        System.out.println("After replace: " + sb);

        // Delete part of the text
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Reverse the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Convert StringBuilder to a String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}
