public class Cube {
    private int edgeLenght;

    public Cube (int edgeLenght) {
        this.edgeLenght = edgeLenght;
    }

    public int volume() {
        return edgeLenght * edgeLenght * edgeLenght;
    }

    public String toString () {
        return "The lenght of the edge is " + edgeLenght + " and the volume " + edgeLenght * edgeLenght * edgeLenght; 
    }
}
