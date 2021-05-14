package Week2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean isAtLeast6 = false;
        while(scan.hasNext()){
            String password = scan.nextLine();
            hasUpperCase = !password.equals(password.toLowerCase());
            hasLowerCase = !password.equals(password.toUpperCase());
            isAtLeast6   = password.length() >= 6 && password.length() <= 32;//Checks for at least 8 characters
           // boolean hasSpecial   = !password.matches("[^A-Za-z0-9]");//Checks at least one char is not alpha numeric
            Pattern p = Pattern.compile("[^A-Za-z0-9]");
            Matcher m = p.matcher(password);
            // boolean b = m.matches();
            boolean b = m.find();
            boolean hasSpecial;
            if (b)
                hasSpecial = true;
            else
                hasSpecial = false;

            if(hasUpperCase &&hasLowerCase && isAtLeast6 && !hasSpecial){
                System.out.println("Senha valida.");
            }
            else
                System.out.println("Senha invalida.");
        }
    }
}
