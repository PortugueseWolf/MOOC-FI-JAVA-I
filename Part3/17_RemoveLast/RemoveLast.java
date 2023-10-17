
// Import array list
import java.util.ArrayList;

public class RemoveLast {
    
    public static void main (String[] args) {
        // Create array list
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast (ArrayList<String> strings) {

        // Check if list isn't empty & if it isn't delete last entry
        if (!(strings.isEmpty())) {
            // Change local list & return it
            strings.remove(strings.size() - 1);
        }
    }
}
