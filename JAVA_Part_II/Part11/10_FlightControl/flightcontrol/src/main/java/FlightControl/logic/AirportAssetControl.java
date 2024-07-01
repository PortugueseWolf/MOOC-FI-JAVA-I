package FlightControl.logic;

import java.util.HashMap;

import FlightControl.domain.*;

public class AirportAssetControl {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;

    public AirportAssetControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(Airplane airplane) {
        airplanes.put(airplane.getID(), airplane);
    }

    public void addFlight(String airplaneID, String departureID, String arrivalID) {
        places.putIfAbsent(departureID, new Place(departureID));
        places.putIfAbsent(arrivalID, new Place(arrivalID));

        Flight flight = new Flight(airplanes.get(airplaneID), places.get(departureID), places.get(arrivalID));

        flights.put(flight.toString(), flight);
    }

    public void printSingleAirplane(String airplaneID) {
        System.out.println(airplanes.get(airplaneID));
    }

    public void printAllAirplanes() {
        for (String printer : airplanes.keySet()) {
            System.out.println(airplanes.get(printer));
        }
    }

    public void printFlights() {
        for (String printer : flights.keySet()) {
            System.out.println(flights.get(printer));
        }
    }
}
