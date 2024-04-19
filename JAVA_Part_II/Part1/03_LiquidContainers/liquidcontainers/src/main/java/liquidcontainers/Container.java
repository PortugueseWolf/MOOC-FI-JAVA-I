package liquidcontainers;

public class Container {
    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public int getLiquid() {
        return liquid;
    }

    public void add(int amount) {
        liquid += amount;
        if (liquid > 100) {
            liquid = 100;
        }
    }

    public void remove(int amount) {
        liquid -= amount;
        if (liquid < 0) {
            liquid = 0;
        }
    }

    public String toString() {
        return liquid + "/100";
    }
}
