
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.parseInt(scanner.nextLine());
        int z = x*y;
        System.out.println(x+" * "+y+" = "+z);
    }
}
