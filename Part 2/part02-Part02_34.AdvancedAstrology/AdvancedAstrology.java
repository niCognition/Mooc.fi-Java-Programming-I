
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int start = 1;
        while (start <= number) {
            System.out.print("*");
            start++;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int start = 1;
        while (start <= number) {
            System.out.print(" ");
            start++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int rows = 1;
        while (rows <= size) {
            printSpaces(size - rows);
            printStars(rows);
            rows++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int rows = 1;
        while (rows <= height) {
            printSpaces(height - rows);
            printStars(rows + (rows - 1));
            rows++;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
