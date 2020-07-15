import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            baseCommands();
            String input = scanner.nextLine();

            if (input.equals("X")) {
                break;
            }

            commandCenter(input);
        }
    }

    public void baseCommands() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

    public void commandCenter(String input) {
        switch (input) {
            case "1":
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();

                jokeManager.addJoke(joke);
                break;

            case "2":
                System.out.println(jokeManager.drawJoke());
                break;

            case "3":
                this.jokeManager.printJokes();
                break;

        }
    }
}