package differentkindsofboxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (getWeight() + item.getWeight() > capacity) {
            return;
        }
        items.add(item);
    }

    public int getWeight() {
        if (items.isEmpty()) {
            return 0;
        }
        int weight = 0;
        for(Item calc : items) {
            weight += calc.getWeight();
        }
        return weight;
    }

    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
