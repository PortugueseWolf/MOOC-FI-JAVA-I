package bigyear;

public class Bird {
    private String name;
    private String latinName;
    private int seen;

    public Bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.seen = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getSeen() {
        return seen;
    }

    public void addSeen() {
        seen ++;
    }

    public String toString() {
        return name + " (" + latinName + "): " + seen + " observations";
    }

}
