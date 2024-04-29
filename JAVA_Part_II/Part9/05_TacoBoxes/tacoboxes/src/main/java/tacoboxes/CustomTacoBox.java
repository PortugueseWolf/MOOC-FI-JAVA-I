package tacoboxes;

public class CustomTacoBox implements TacoBox{
    private int numberOfTacos;

    public CustomTacoBox(int tacos) {
        this.numberOfTacos = tacos;
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
