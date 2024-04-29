package printanotherhashmap;

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {

    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for(String printer : hashmap.keySet()) {
            System.out.println(hashmap.get(printer));
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for(String printer : hashmap.keySet()) {
            if (hashmap.get(printer).getName().contains(text)) {
                System.out.println(hashmap.get(printer));
            }
        }
    }

}
