
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

    public String longest(){
        if(elements.isEmpty()){
            return null;
        }
        String longest = "";
        int lenght = 0;
        for(String compare : elements){
            if(compare.length() > longest.length()){
                longest = compare;
                lenght = compare.length();
            }
        }
        return longest;
    }

}
