package bigyear;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        UserInterface ui = new UserInterface(scanner, birds);

        ui.start();
    }
}
