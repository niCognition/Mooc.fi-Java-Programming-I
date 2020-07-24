
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {

            System.out.print("> ");

            String input = scan.nextLine();



            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                    if (amount < 0) {
                        continue;
                    }

                    first += amount;

                    if (first > 100) {
                        first = 100;
                    }
            }

            if (command.equals("move")) {
               if (amount < 0) {
                   continue;
               }

               if (first < amount) {
                   second += first;
               }

               if (first >= amount) {
                   first -= amount;
                   second += amount;
               }

               if (second > 100) {
                   second = 100;
               }
            }

            if (command.equals("remove")) {
                second -= amount;

                if (second < 0) {
                    second = 0;
                }
            }

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
        }
    }

}
