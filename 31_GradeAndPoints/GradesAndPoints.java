
// Import Scanner
import java.util.Scanner;

    public class GradesAndPoints {

        public static void main (String[] args) {

            // Declare scanner
            Scanner scanner = new Scanner(System.in);

            // Ask user for number of points
            System.out.println("Give points [0-100]:");

            // Declare answer as an Integer names points
            int points = Integer.valueOf(scanner.nextLine());

            // Check with an if statement where the points provided fit (Check README.md)
            if (points > 0) {
                // Impossible
                System.out.println("impossible!");
                
            } else if (points < 50) {
                // Failed
                System.out.println("failed");

            } else if (points < 60) {
                // 1
                System.out.println("1");

            } else if (points < 70) {
                // 2
                System.out.println("2");

            } else if (points < 80) {
                // 3
                System.out.println("3");

            } else if (points < 90) {
                // 4
                System.out.println("4");

            } else if (points < 101) {
                // 5
                System.out.println("5");
                
            } else {
                // Incredible
                System.out.println("incredible!");
            }

            // Close scanner
            scanner.close();
        }
    }