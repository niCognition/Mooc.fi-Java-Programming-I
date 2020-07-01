
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class PrintingAFile {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
