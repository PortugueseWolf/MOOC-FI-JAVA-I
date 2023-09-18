
import java.util.Scanner;

public class Story {
    
    public static void main (String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for the characters name
        System.out.println("I will tell you a story, but I need some information first." + "\n" +
                            "What is the main character called?");

        // Declare String variable name has the user answer
        String name = scanner.nextLine();

        // Ask user for characters job
        System.out.println("What is their job?");

        // Declare String variable job has the user input
        String job = scanner.nextLine();

        // Print the story using the information provided by the user
        System.out.println("Here is the story:" + "\n" +
                            "Once upon a time there was " + name + ", who was " + job + "." + "\n" +
                            "On the way to work, " + name + " reflected on life." + "\n" +
                            "Perhaps " + name + " will not be " + job + " forever.");

        // Close scanner
        scanner.close();

    }


}
