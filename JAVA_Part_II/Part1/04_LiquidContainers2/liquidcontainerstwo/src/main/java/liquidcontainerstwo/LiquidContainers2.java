package liquidcontainerstwo;

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerManager containers = new ContainerManager();
        UserInterface ui = new UserInterface(scanner, containers);

        ui.start();
    }
}
