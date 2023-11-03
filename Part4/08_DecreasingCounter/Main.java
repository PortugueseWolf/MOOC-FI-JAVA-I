
public class Main {
    public static void main (String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.decrement();

        counter.printValue();

        counter.reset();

        counter.printValue();
    }
}
