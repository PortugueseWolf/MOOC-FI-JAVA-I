package liquidcontainerstwo;

public class ContainerManager {
    private Container firstContainer;
    private Container secondContainer;

    public ContainerManager () {
        this.firstContainer = new Container();
        this.secondContainer = new Container();
    }

    public void add(int amount) {
        if (amount > 0) {
            firstContainer.add(amount);
        }
    }

    public void remove(int amount) {
        secondContainer.remove(amount);
    }

    public void move(int amount) {
        if (amount > 0) {
            if(firstContainer.contains() <= amount) {
                secondContainer.add(firstContainer.contains());
                firstContainer.remove(amount);
            } else {
                secondContainer.add(amount);
                firstContainer.remove(amount);
            }
        }
    }

    public String toString() {
        return "First: " + firstContainer.contains() + "/100" + "\n" +
                "Second: " + secondContainer.contains() + "/100";
    }
}
