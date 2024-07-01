package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place departure;
    private Place arrival;

    public Flight(Airplane airplane, Place departure, Place arrival) {
        this.airplane = airplane;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String toString() {
        return airplane.toString() + " (" + departure.getID() + "-" + arrival.getID() + ")";
    }


}
