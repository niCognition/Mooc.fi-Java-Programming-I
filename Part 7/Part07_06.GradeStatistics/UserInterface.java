import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }



    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();

            int points = Integer.parseInt(input);

            if (points == -1) {
                System.out.println(register);
                break;
            }

            if (points < 0 || points > 100) {
                continue;
            }

            this.register.addGrade(points);

        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
