import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                System.out.print("What information will be printed? ");
                String answer = scanner.nextLine();
                scanner.close();

                if (answer.equals("everything")) {
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i).toString());
                    }
                }
                if (answer.equals("name")) {
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i).getTitle());
                    }
                }
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
            
        }
    }
}
