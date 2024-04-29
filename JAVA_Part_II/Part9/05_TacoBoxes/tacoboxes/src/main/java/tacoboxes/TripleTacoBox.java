package tacoboxes;

public class TripleTacoBox implements TacoBox {
    private int numberOfTacos;

    public TripleTacoBox() {
        this.numberOfTacos = 3;
    }

    public void eat() {
        if (numberOfTacos > 0) {
            numberOfTacos--;
        }
    }

    public int tacosRemaining() {
        return numberOfTacos;
    }
}
