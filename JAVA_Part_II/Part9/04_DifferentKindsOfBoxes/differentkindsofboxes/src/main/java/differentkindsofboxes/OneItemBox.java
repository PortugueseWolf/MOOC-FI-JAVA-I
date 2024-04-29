package differentkindsofboxes;

import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> box;

    public OneItemBox() {
        this.box = new ArrayList<>();
    }

    public void add(Item item) {
        if (box.isEmpty()) {
            box.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (box.contains(item)) {
            return true;
        }
        return false;
    }
}
