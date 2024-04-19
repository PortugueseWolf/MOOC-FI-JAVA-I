package recipesearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            String name = "";
            int time = 0;

            while (reader.hasNextLine()) {

                String row = reader.nextLine();

                if (row.equals("")) {
                    name = "";
                    time = 0;
                    continue;
                }

                if (name.equals("")) {
                    name = row;
                    continue;
                }

                if (time == 0) {
                    time = Integer.valueOf(row);
                    recipes.add(new Recipe(name, time));
                    continue;
                }

                for (Recipe search : recipes) {
                    if (search.getName().equals(name)) {
                        search.addIngredient(row);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Recipe printer : recipes) {
            System.out.println(printer);
            printer.printIngredients();
        }

        System.out.println("");
        System.out.println("Commands: " + "\n" +
                "list - lists the recipes" + "\n" +
                "stop - stops the program" + "\n" +
                "find name - searches recipes by name" + "\n" +
                "find cooking time - searches recipes by cooking time" + "\n" +
                "find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                scanner.close();
                break;
            }

            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe printer : recipes) {
                    System.out.println(printer);
                }
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe printer : recipes) {
                    if (printer.getName().contains(word)) {
                        System.out.println(printer);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe printer : recipes) {
                    if (printer.getTime() <= time) {
                        System.out.println(printer);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe printer : recipes) {
                    if (printer.hasIngredient(ingredient)) {
                        System.out.println(printer);
                    }
                }
            }
            System.out.println("");
        }
    }
}
