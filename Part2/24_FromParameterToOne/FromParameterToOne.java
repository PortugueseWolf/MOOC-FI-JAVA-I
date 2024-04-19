
public class FromParameterToOne {
    public static void main (String[] args) {
        // Invoke method
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne (int number) {
        // Loop from number to one
        for (int i = number; i >= 1; i --) {
            // print i
            System.out.println(i);
        }
    }
}