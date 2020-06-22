
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = true;
        while(validInput) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                validInput = false;
            }

            String[] pieces = input.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }
}
