package interfaceinabox;

import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + weight() <= maxCapacity) {
            items.add(packable);
        }
    }

    public double weight() {
        if (items.isEmpty()) {
            return 0;
        }
        
        double totalWeight = 0;
        for(Packable calc : items) {
            totalWeight += calc.weight();
        }
        return totalWeight;
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
