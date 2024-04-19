package bigyear;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner, ArrayList<Bird> birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                scanner.close();
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();
                birds.add(new Bird(name, nameLatin));
            }

            if (command.equals("All")) {
                for(Bird printer : birds) {
                    System.out.println(printer);
                }
            }

            if (command.equals("Observation")) {
                System.out.print("Bird: ");
                String name = scanner.nextLine();
                int count = 0;
                for(Bird searcher : birds) {
                    if (searcher.getName().equals(name)) {
                        searcher.addSeen();
                        count ++;
                    }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird?");
                String bird = scanner.nextLine();

                for(Bird printer : birds) {
                    if (printer.getName().equals(bird)) {
                        System.out.println(printer);
                    }
                }
            }

        }
    }
}
