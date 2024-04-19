
public class AdvancedAstrology {

    public static void main (String[] args) {
        christmasTree(4);
    }   
    
    // Create the method that prints the amount needed of spaces " "
    public static void printSpaces (int number) {
        // loop the amount of times needed
        for (int i = 0; i < number; i++) {
            // Print the space
            System.out.print(" ");
        }
    }

    // Create the method printStars
    public static void printStars (int number) {
        // Loop the amount needed
        for (int i = 0; i < number; i++) {
            // Print the star
            System.out.print("*");
        }
        // After all the stars are printed add a line break
        System.out.println("");
    }

    // Create the method printTriangle, wich prints the right leaning triangle
    public static void printTriangle (int size) {
        // Loop for the amount of rows
        for (int i = 1; i <= size; i++) {
            // Print the spaces needed which are size minus i
            printSpaces(size - i);

            // Print the stars wich is i
            printStars(i);
        }
    }

    // Create the method that prints the christmas tree
    public static void christmasTree(int height) {
        // Loop for the height of the tree without counting the base
        for (int i = 1; i <= height; i++) {
            //print the stars
            printSpaces(height - i);

            // Print the stars
            printStars(i + i - 1);

        }

        // Print the base
        for (int i = 0; i < 2; i++) {
            // Print the spaces
            printSpaces(height - 2);

            // Print the stars
            printStars(3);
        }
    }
}
