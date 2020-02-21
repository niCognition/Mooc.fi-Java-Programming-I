
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        double second = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        double third = Integer.parseInt(scanner.nextLine());
        double average = (first+second+third)/3;
        System.out.println("The average is "+average);
        // Write your program here

    }
}
