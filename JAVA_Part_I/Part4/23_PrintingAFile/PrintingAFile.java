import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(Paths.get("data.txt"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}