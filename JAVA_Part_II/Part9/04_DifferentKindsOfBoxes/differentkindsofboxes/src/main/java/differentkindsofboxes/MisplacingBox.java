package differentkindsofboxes;

import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> box;

    public MisplacingBox() {
        this.box = new ArrayList<>();
    }

    public void add(Item item) {
        box.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
