package recipesearch;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public boolean hasIngredient(String ingredient) {
        if (ingredients.contains(ingredient)) {
            return true;
        }
        return false;
    }

    public void printIngredients() {
        System.out.println(ingredients);
    }

    public String toString() {
        return name + ", cooking time: " + time;
    }

}
