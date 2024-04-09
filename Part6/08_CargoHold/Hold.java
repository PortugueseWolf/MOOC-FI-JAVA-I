import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + totalWeight() <= maximumWeight){
            suitcases.add(suitcase);
        }
    }

    public int totalWeight(){
        int weight = 0;

        for(Suitcase scale : suitcases){
            weight += scale.totalWeight();
        }
        return weight;
    }

    public String toString(){
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems(){
        for(Suitcase printer : suitcases){
            printer.printItems();
        }
    }
}
