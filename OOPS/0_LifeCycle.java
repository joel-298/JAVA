// LIFE CYCLE OF A CODE : 


1️⃣ At Coding Time (c)
🔹 Definition: This refers to the time when a programmer is writing the code in an editor (like VS Code, IntelliJ, etc.).
                Errors at this stage are usually syntax errors, logical mistakes, or misused keywords.
🔹 Example:
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!")
    }
}
🔴 Error: Missing semicolon (;). This is a syntax error that will be caught during compilation.





2️⃣ At Compile Time (b)
🔹 Definition: This refers to the time when the Java compiler (javac) translates the source code (.java file) into bytecode (.class file).
                The compiler checks for 
                    - syntax errors
                    - type mismatches
                    - missing variables, etc.
🔹 Example:
class Test {
    public static void main(String[] args) {
        int num = "Hello";  // ❌ Compilation error (Type Mismatch)
    }
}
🔴 Error: String cannot be assigned to an int.
🔹 This is caught at compile time and Java wont generate a .class file until fixed.




3️⃣ At Runtime (a)
🔹 Definition: This refers to the time when the program is actually running/executing after compilation.
                Errors at this stage are called Runtime Errors (Exceptions), such as:
                    - NullPointerException
                    - ArithmeticException (like divide by zero)
                    - ArrayIndexOutOfBoundsException
🔹 Example:
class Test {
    public static void main(String[] args) {
        int num = 10 / 0;  // ❌ Runtime Error (Divide by Zero)
    }
}
🔴 Error: ArithmeticException: / by zero
✅ The code compiles fine, but fails at runtime.


