import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        int weight = totalWeight();
        if(!(weight + item.getWeight() > maximumWeight)){
            items.add(item);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Item weightChecker : items){
            totalWeight += weightChecker.getWeight();
        }
        return totalWeight;
    }

    public String toString(){
        if(items.isEmpty()){
            return "no items (0kg)";
        }
        if(items.size() == 1){
            return "1 item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }

    public void printItems(){

        for(Item printer : items){
            System.out.println(printer.getName() + " (" + printer.getWeight() + " kg)");
        }
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }

        int maxWeight = 0;
        int index = 0;

        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getWeight() > maxWeight){
                maxWeight = items.get(i).getWeight();
                index = i;
            }
        }
        return items.get(index);
    }
}
