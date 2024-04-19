import java.util.Scanner;
import java.nio.file.Paths;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();
        scanner.close();
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] splitter = line.split(",");
                int homeScore = Integer.valueOf(splitter[2]);
                int visitingScore = Integer.valueOf(splitter[3]);

                if (splitter[0].contains(team)) {
                    gamesPlayed ++;
                    if (homeScore > visitingScore) {
                        gamesWon ++;
                    } else {
                        gamesLost ++;
                    }
                }
                if (splitter[1].contains(team)) {
                    gamesPlayed ++;
                    if (homeScore > visitingScore) {
                        gamesLost ++;
                    } else {
                        gamesWon ++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading " + file + "!");
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);
    }
}