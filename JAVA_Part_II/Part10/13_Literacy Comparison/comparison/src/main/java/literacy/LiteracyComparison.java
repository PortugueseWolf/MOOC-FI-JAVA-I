package literacy;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        
        ArrayList<Country> list = read("literacy.csv");


        list.stream()
            .sorted()
            .forEach(line -> System.out.println(line));
    }

    public static ArrayList<Country> read(String file) {
        ArrayList<Country> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .forEach(part -> list.add(new Country(part[3], Integer.parseInt(part[4]), part[2].trim(), Double.parseDouble(part[5]))));
                
        } catch (Exception e) {
            System.out.println("Error!");
        }
        return list;
    }
}
