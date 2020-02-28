
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());
        int start = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
        // Write your program here
    }
}
