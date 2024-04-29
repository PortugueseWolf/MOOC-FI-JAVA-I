package liquidcontainers;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerManager containers = new ContainerManager();
        UserInterface ui = new UserInterface(scanner, containers);

        ui.start();
    }
}
