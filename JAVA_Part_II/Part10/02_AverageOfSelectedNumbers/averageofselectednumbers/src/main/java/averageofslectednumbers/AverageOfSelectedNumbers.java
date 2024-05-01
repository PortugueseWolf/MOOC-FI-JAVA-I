package averageofslectednumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop");

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }
            list.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String command = scanner.nextLine();
        scanner.close();

        if (command.equals("p")) {
            positive(list);
        }
        if (command.equals("n")) {
            negative(list);
        }
    }

    public static void positive(ArrayList<String> list) {
        double average = list.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        System.out.println("Average of the positive numbers: " + average);
    }

    public static void negative(ArrayList<String> list) {
        double average = list.stream()
            .mapToInt(number -> Integer.valueOf(number))
            .filter(number -> number <= 0)
            .average()
            .getAsDouble();

        System.out.println("Average of the negative numbers: " + average);
    }
}
