// PASSWORD EXCEPTION : 
import java.util.Scanner;

public class PasswordException {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            String password = sc.nextLine();

            try
            {
                validatePassword(password);
                System.out.println("Correct");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

        public static void validatePassword(String password) throws Exception{
            if(password.length() < 6)
                throw new Exception("Too Short!");
            // 1abc //abc
            if(!password.matches(".*\\d.*"))
            {
                throw new Exception("No digit!  ");
            }
        }
}