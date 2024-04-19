
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int count = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                scanner.close();
                System.out.println("Longest name: " + name);
                System.out.println("Average of the birth years: " + 1.0 * sum / count);
                break;                
            }
            String[] splitter = input.split(",");
            sum += Integer.valueOf(splitter[1]);
            count ++;

            if (splitter[0].length() > name.length()) {
                name = splitter[0];
            }
        }
    }
}
