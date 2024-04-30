package herd;

import java.util.*;

public class Herd implements Movable {
    private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable transport : organisms) {
            transport.move(dx, dy);
        }
    }

    public String toString() {
        String toReturn = "";
        for(int i = 0; i < organisms.size(); i++) {
            if (i == organisms.size() -1) {
            toReturn += organisms.get(i).toString();
            break;
            }
            toReturn += organisms.get(i).toString() + "\n";
        }
        return toReturn;
    }
}
