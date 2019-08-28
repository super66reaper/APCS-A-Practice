import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username;
        String password;
        
        System.out.println("Enter Username:");
        username = scan.nextLine();
        if (username.equals("admin person") || username.equals("skater_gurl17")) {
            System.out.println("Username Taken");
            System.exit(0);
        }
        System.out.println("Enter Password:");
        System.out.println("Rules:");
        System.out.println("Must start with vowel");
        System.out.println("Must contain one of these symbols: # ! $ & *");
        System.out.println("Must not have username in password");
        System.out.println("Numbers are allowed, but only as the last two places");
        password = scan.nextLine();
        String firstLet;
        firstLet = password.substring(0,1);
        if (firstLet.equals("a") || firstLet.equals("e") || firstLet.equals("i") || firstLet.equals("o") || firstLet.equals("u")) {
            
        }
        else {
            System.out.println("Doesn't Fit Rules");
            System.exit(0);
        }
    }
}