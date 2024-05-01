package limitednumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input < 0) {
                scanner.close();
                break;
            }
            list.add(input);
        }

        list.stream()
            .filter(number -> number >= 1 && number <= 5)
            .forEach(number -> System.out.println(number));
    }
}
