package FlightControl.ui;

import java.util.Scanner;

import FlightControl.domain.*;
import FlightControl.logic.*;

public class TextUI {
    private Scanner scanner;
    private AirportAssetControl assetControl;

    public TextUI(Scanner scanner, AirportAssetControl assetControl) {
        this.scanner = scanner;
        this.assetControl = assetControl;
    }

    public void start() {

        // Asset Control
        System.out.println("Part 1: Airport Asset Control");
        while (true) {
            System.out.println(
                    "Choose an action:" + "\n" +
                    "[1] Add an airplane" + "\n" +
                    "[2] Add a flight" + "\n" +
                    "[x] Exit Airport Asset Control");
            System.out.print("> ");

            String input = scanner.nextLine();

            if (!(input.equals("1") || input.equals("2") || input.equals("x"))) {
                continue;
            }

            if (input.equals("x")) {
                System.out.println();
                break;
            }

            int command = Integer.parseInt(input);

            if (command == 1) {
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                assetControl.addAirplane(new Airplane(id, capacity));
                continue;
            }

            if (command == 2) {
                System.out.print("Give the airplane id: ");
                String airplaneid = scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                String departureID = scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String arrivalID = scanner.nextLine();
                assetControl.addFlight(airplaneid, departureID, arrivalID);
                continue;
            }
        }

        System.out.println("Part 2: Flight Control");
        while (true) {
            System.out.println(
                    "Choose an action:" + "\n" +
                    "[1] Print airplanes" + "\n" +
                    "[2] Print flights" + "\n" +
                    "[3] Print airplane details" + "\n" +
                    "[x] Quit");
            System.out.print("> ");

            String input = scanner.nextLine();

            if (!(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("x"))) {
                continue;
            }

            if (input.equals("x")) {
                scanner.close();
                break;
            }

            int command = Integer.parseInt(input);

            if (command == 1) {
                assetControl.printAllAirplanes();
                continue;
            }

            if (command == 2) {
                assetControl.printFlights();
                continue;
            }

            if (command == 3) {
                System.out.print("Give the airplane id: ");
                String airplaneID = scanner.nextLine();
                assetControl.printSingleAirplane(airplaneID);
            }
        }
    }
}
