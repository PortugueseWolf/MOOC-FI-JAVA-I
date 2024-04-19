package grade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Archiver grades = new Archiver();
        UserInterface ui = new UserInterface(scanner, grades);

        ui.start();
    }
}
