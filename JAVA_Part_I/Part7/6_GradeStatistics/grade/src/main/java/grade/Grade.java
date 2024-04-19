package grade;

public class Grade {
    private int points;
    private boolean passing;
    private int grade;

    public Grade(int points, boolean passing, int grade) {
        this.points = points;
        this.passing = passing;
        this.grade = grade;
    }

    public boolean getPassing() {
        return passing;
    }

    public int getPoints() {
        return points;
    }

    public int getGrade() {
        return grade;
    }
}
