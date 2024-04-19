
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment apartment) {
        if(squares > apartment.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment apartment){
        
        int difference = (squares * princePerSquare) - (apartment.squares * apartment.princePerSquare);
        if (difference < 0) {
            return difference * -1;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment apartment){
        if((princePerSquare * squares) > (apartment.princePerSquare * apartment.squares)){
            return true;
        }
        return false;
    }

}
