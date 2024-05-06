package literature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        //list.add(new Book("The Ringing Lullaby Book", 0));
        //list.add(new Book("The Exiting Transpotation Vehicles", 0));
        //list.add(new Book("The Snowy Forest Calls", 12));
        //list.add(new Book("Litmanen 10", 10));

        String name = "";
        int age = 0;

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();

            if (input.equals("")) {
                scanner.close();
                break;
            }

            name = input;

            System.out.print("Input the age recommendation: ");
            age = Integer.parseInt(scanner.nextLine());

            list.add(new Book(name, age));
        }

        System.out.println(list.size() + " books in total.");

        Comparator<Book> compare = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getName);

        Collections.sort(list, compare);

        list.stream()
            .forEach(printer -> System.out.println(printer));
    }
}
