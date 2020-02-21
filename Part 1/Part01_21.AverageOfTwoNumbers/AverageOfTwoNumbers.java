
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        double second = Integer.parseInt(scanner.nextLine());
        double average = (first + second)/2;
        System.out.println("The average is " + average);
    }
}
