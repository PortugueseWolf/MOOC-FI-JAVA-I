package grade;

import java.util.ArrayList;

public class Archiver {
    private ArrayList<Grade> grades;

    public Archiver() {
        this.grades = new ArrayList<>();
    }

    public void add(int points) {
        if (points >= 0 && points <= 100) {
            grades.add(new Grade(points, calculatePassing(points), calculateGrade(points)));
        }
    }

    public boolean calculatePassing(int points) {
        if (points < 50) {
            return false;
        }
        return true;
    }

    public int calculateGrade(int points) {
        if (points < 50) {
            return 0;
        }
        if (points < 60) {
            return 1;
        }
        if (points < 70) {
            return 2;
        }
        if (points < 80) {
            return 3;
        }
        if (points < 90) {
            return 4;
        }
        return 5;
    }

    public double pointAverageAll() {
        int sum = 0;

        for (Grade calculator : grades) {
            sum += calculator.getPoints();
        }

        return 1.0 * sum / grades.size();
    }

    public String pointAveragePassing() {
        int sum = 0;
        int count = 0;

        for (Grade calculator : grades) {
            if (calculator.getPassing()) {
                sum += calculator.getPoints();
                count++;
            }
        }
        if (count == 0) {
            return "-";
        }
        return Double.toString(1.0 * sum / count);
    }

    public double passPercentage() {
        int count = 0;

        for (Grade calculator : grades) {
            if (calculator.getPassing()) {
                count++;
            }
        }
        return 100.0 * count / grades.size();
    }

    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (Grade printer : grades) {
                if (printer.getGrade() == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
