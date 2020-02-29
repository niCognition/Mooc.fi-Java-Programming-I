
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <= end; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

    }
}
