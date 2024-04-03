import java.util.Scanner;
import java.util.ArrayList;

public class Items {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String input = scanner.nextLine();

            if (input.equals("")) {
                scanner.close();
                for (int i = 0; i < items.size(); i++) {
                    System.out.println(items.get(i).toString());
                }
                break;
            }
            items.add(new Item(input));
        }
    }
}
