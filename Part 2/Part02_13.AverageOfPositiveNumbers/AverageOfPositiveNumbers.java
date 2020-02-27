
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPositive = 0;
        double sumPositive = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                numberPositive = numberPositive + 1;
                sumPositive = sumPositive + input;
            }
        }
        if (sumPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumPositive/numberPositive);
        }
    }
}
