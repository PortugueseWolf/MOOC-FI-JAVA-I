
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Close scanner
        scanner.close();
        
        // Create var to keep index if found or not found (var == -1, means not found
        int wasFound = -1;

        // Loop through array searching
        for (int i = 0; i < array.length; i++) {
            // If it's the value we print the number plus index
            if (array[i] == searching) {
                // Was found so set index to the wasFound var
                wasFound = i;
                
                // Close loop since it was found
                break;
            }
        }
        // Print our results accordingly
        if (wasFound == -1) {
            System.out.println(searching + " was not found.");
        } else {
            System.out.println(searching + " is at index " + wasFound + ".");
        }
    }
}
