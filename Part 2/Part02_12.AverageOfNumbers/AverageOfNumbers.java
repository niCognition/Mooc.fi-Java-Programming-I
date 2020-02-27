
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }
            numbers = numbers + 1;
            sum = sum + input;
        }

        System.out.println("Average of the numbers: " + sum/numbers);

    }
}
