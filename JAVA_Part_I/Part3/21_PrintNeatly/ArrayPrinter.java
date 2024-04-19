
public class ArrayPrinter {
    
    public static void main (String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly (int[] array) {
        // Loop through array and print
        for (int i = 0; i < array.length; i++) {
            // Check if i = o because first print is diferent
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }
}
