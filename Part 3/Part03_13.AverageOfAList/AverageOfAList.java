
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            numbers.add(input);
        }

        double sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }

        double average = (sum / numbers.size() * 1.0);

        System.out.println("Average: " + average);
        
    }
}
