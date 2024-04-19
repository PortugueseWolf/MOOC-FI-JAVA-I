
import java.util.Scanner;

public class NameOfTheOldest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                scanner.close();
                System.out.println("Name of the oldest: " + name);
                break;
            }
            
            String[] splitter = input.split(",");
            
            int ageTester = Integer.valueOf(splitter[1]);
            
            if (ageTester > age) {
                age = ageTester;
                name = splitter[0];
            }
        }
    }
}
