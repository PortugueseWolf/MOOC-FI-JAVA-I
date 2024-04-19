
public class StarSign {

    public static void main (String[] args) {
        printStars(10);
        printSquare(5);
    }

    // Create method to print the amount requested of *
    public static void printStars (int number) {
        // Loop amount of times asked
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        // Print the required line break at the end
        System.out.println("");
    }

    // Create method that prints the filled square of stars
    public static void printSquare (int size) {
        // Loop for the amount of lines
        for (int i = 0; i < size; i++) {
            // Print the required stars in the line
            // Since it's a square it's the same as number of lines
            printStars(size);
        }
    }

    // Create a method that prints a rectangle
    public static void printRectangle (int width, int height) {
        // Loop for the amount of height
        for (int i = 0; i < height; i++) {
            // Print the width
            printStars(width);
        }
    }

    // Create a method that prints a triangle
    public static void printTriangle (int size) {
        // Loop number of rows
        for (int i = 1; i <= size; i++) {
            // Print the row
            printStars(i);
        }
    }
}
