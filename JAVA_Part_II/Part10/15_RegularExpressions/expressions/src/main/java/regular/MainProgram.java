package regular;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker check = new Checker();
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (check.isDayOfWeek(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        if (check.allVowels(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        if (check.timeOfDay(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
