package averageofnumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while(true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                scanner.close();
                break;
            }
            input.add(row);
        }

        double average = input.stream()
            .mapToInt(s -> Integer.parseInt(s))
            .average()
            .getAsDouble();

        System.out.println("average of numbers: " + average);
            

    }
}
