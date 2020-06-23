
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            names.add(pieces[0]);
            birthYears.add(Integer.parseInt(pieces[1]));
        }

        String longest = names.get(0);
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        System.out.println("Longest name: " + longest);

        int sumOfBirthYears = 0;
        for (int year : birthYears) {
            sumOfBirthYears = sumOfBirthYears + year;
        }
        System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());
    }
}
