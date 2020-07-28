import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passing;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.passing = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGrade(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));

        if (points >= 50) {
            this.passing.add(points);
        }
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageGrade() {
        double total = 0;
        for (int point : points) {
            total += point;
        }

        return total / this.points.size();
    }

    public double averagePassingGrade() {
        if (this.passing.isEmpty()) {
            return -1;
        }

        double total = 0;
        for (int passingPoints : passing) {
            total += passingPoints;
        }

        return total / this.passing.size();
    }

    public double passPercentage() {

        return 100 * (this.passing.size() * 1.0) / this.points.size();

    }

    public String toString() {
        return "Point average (all): " + averageGrade() + "\n" +
                "Point average (passing): " + averagePassingGrade() + "\n" +
                "Pass percentage: " + passPercentage();
    }
}
