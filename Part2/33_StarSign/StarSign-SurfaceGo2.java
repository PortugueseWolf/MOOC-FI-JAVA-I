
public class StarSign {
    public static void main (String[] args) {
        printStars(10);
    }

    public static void printStars (int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
