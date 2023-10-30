
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        usernames.add("alex");
        usernames.add("emma");
        passwords.add("sunshine");
        passwords.add("haskell");

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        scanner.close();

        if (usernames.contains(username)) {
            for (int i = 0; i < usernames.size(); i++) {

                if (username.equals(usernames.get(i))) {

                    if (password.equals(passwords.get(i))) {
                        
                        System.out.println("You have successfully logged in!");
                        break;
                        
                    } else {
                        System.out.println("Incorrect username or password!");
                    }
                }
            }
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}