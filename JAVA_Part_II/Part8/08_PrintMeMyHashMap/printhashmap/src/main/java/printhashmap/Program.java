package printhashmap;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("test1", "example1");
        hashmap.put("test2", "example2");

        printKeys(hashmap);
        printKeysWhere(hashmap, "test");
        printValuesOfKeysWhere(hashmap, "t2");
        
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for(String printer : hashmap.keySet()) {
            System.out.println(printer);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String printer : hashmap.keySet()) {
            if (printer.contains(text)) {
                System.out.println(printer);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String printer : hashmap.keySet()){
            if (printer.contains(text)) {
                System.out.println(hashmap.get(printer));
            }
        }
    }
}
