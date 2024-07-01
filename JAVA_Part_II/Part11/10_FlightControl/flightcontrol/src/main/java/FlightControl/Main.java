package FlightControl;

import java.util.Scanner;

import FlightControl.logic.*;
import FlightControl.ui.TextUI;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirportAssetControl assetControl = new AirportAssetControl();
        TextUI ui = new TextUI(scanner, assetControl);

        ui.start();
    }
}
