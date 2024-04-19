package liquidcontainers;

import java.util.Scanner;

public class LiquidContainers {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        
        while (true) {
            System.out.println("First: " + firstContainer + "/100" + "\n" +
                "Second: " + secondContainer + "/100");

            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.equals("quit")) {
                scanner.close();
                break;
            }

            String[] splitter = input.split(" ");
            String command = splitter[0];
            int amount = Integer.valueOf(splitter[1]);

            if(amount < 0){
                continue;
            }

            if (command.equals("add")) {
                if (firstContainer + amount <= 100) {
                    firstContainer += amount;
                } else {
                    firstContainer = 100;
                }
            }

            if (command.equals("move")) {
                if (firstContainer >= amount) {
                    firstContainer -= amount;
                    secondContainer += amount;
                } else if (firstContainer < amount) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                }

                if (secondContainer > 100) {
                    secondContainer = 100;
                }
            }

            if (command.equals("remove")) {
                if (secondContainer < amount) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }
        }
    }
}
