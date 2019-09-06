import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username;
        String password;
        Boolean success;
        
        System.out.println("Enter Username:");
        username = scan.nextLine();

        if (username.equals("admin person") || username.equals("skater_gurl17") || username.equals("gary") || username.equals("jimbob234")) {
            System.out.println("Username Taken");
            System.exit(0);
        }

        System.out.println("Username accepted");

        System.out.println("Enter Password:");
        System.out.println("Rules:");
        System.out.println("Must start with vowel");
        System.out.println("Must contain one of these symbols: # ! $ & *");
        System.out.println("Must not have username in password");
        System.out.println("Numbers are allowed, but only as the last two places");
        password = scan.nextLine();
        
        password = password.trim();

        String firstLet;
        firstLet = password.substring(0,1);
        firstLet = firstLet.toLowerCase();
        if (firstLet.equals("a") || firstLet.equals("e") || firstLet.equals("i") || firstLet.equals("o") || firstLet.equals("u")) {
            if (password.contains("#") || password.contains("!") || password.contains("$") || password.contains("&") || password.contains("*")) {
                if (!password.contains(username)) {
                    String passNoLast;
                    int passLength = password.length();
                    passNoLast = password.substring(0, passLength - 2);

                    if (!passNoLast.matches(".*\\d.*")) {
                        System.out.println("Password accepted");
                        success = true;
                    }
                    else {
                        System.out.println("Password doesn't Fit Rules");
                        System.exit(0);
                    }
                    
                }
                else {
                    System.out.println("Password doesn't Fit Rules");
                    System.exit(0);
                }
            }
            else {
                System.out.println("Password doesn't Fit Rules");
                System.exit(0);
            }
        }
        else {
            System.out.println("Password doesn't Fit Rules");
            System.exit(0);
        }

        if (success = true) {
            System.out.println("Account successfully created");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }
}