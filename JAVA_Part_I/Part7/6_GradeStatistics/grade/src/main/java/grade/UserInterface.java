package grade;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Archiver grades;

    public UserInterface(Scanner scanner, Archiver grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                scanner.close();
                break;
            }
            grades.add(points);
        }
        System.out.println("Point average (all): " + grades.pointAverageAll());
        System.out.println("Point average (passing): " + grades.pointAveragePassing());
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribution: ");
        grades.gradeDistribution();
    }
}
