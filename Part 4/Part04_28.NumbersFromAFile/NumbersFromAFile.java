
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

       ArrayList<Integer> list = new ArrayList<>();

       try (Scanner fileReader = new Scanner(Paths.get(file))) {
           while (fileReader.hasNextLine()) {
               int number = Integer.parseInt(fileReader.nextLine());

               if (number >= lowerBound && number <= upperBound) {
                   list.add(number);
               }
           }
       } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       }

        System.out.println("Numbers: " + list.size());
    }
}
