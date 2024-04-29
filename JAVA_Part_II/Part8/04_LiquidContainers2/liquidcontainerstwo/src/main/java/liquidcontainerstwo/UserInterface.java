package liquidcontainerstwo;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ContainerManager containers;

    public UserInterface (Scanner scanner, ContainerManager containers) {
        this.scanner = scanner;
        this. containers = containers;
    }

    public void start() {
        while (true) {
            System.out.println(containers);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                scanner.close();
                break;
            }

            String[] splitter = input.split(" ");

            String command = splitter[0];
            int amount = Integer.valueOf(splitter[1]);

            if (command.equals("add")) {
                containers.add(amount);
            }

            if (command.equals("move")) {
                containers.move(amount);
            }

            if (command.equals("remove")) {
                containers.remove(amount);
            }

            System.out.println("");
        }
    }
}
