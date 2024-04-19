
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!(meals.contains(meal))){
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        for(String printer : meals){
            System.out.println(printer);
        }
    }

    public void clearMenu(){
        meals.clear();
    }

}
