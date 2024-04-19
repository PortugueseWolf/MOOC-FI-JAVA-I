
import java.util.Scanner;

public class AVClub {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                scanner.close();
                break;
            }

            String[] splitter = input.split(" ");

            for (String word : splitter) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
