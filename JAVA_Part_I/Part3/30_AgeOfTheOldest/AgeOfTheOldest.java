
import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                scanner.close();
                System.out.println("Age of the oldest: " + age);
                break;
            }

            String[] splitter = input.split(",");
            int tester = Integer.valueOf(splitter[1]);

            if (tester > age) {
                age = tester;
            }
        }
    }
}
