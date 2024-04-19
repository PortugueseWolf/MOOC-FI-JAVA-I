
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String onList = "";
        for(int i = 0; i < elements.size(); i++){
            if(i == elements.size() - 1){
                onList += elements.get(i);
                break;
            }
            onList += elements.get(i) + "\n";
        }

        if(elements.isEmpty()){
            return "The collection " + name + " is empty.";
        }
        if(elements.size() == 1){
        return "The collection " + name + " has 1 element:" + "\n" + elements.get(0);
        }
        return "The collection " + name + " has " + elements.size() + " elements:" + "\n" + onList;
    }
    
}
