package booksfromfile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
    
    public static void main(String[] args) {
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .forEach(row -> list.add(new Book(row[0], Integer.parseInt(row[1]), Integer.parseInt(row[2]), row[3])));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
