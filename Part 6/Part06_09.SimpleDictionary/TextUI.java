import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equals("end")) {
                break;
            }

            commandCenter(inputCommand);
            System.out.println("");
        }

        System.out.println("Bye bye!");
    }

    public void commandCenter(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = this.scanner.nextLine();
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        this.simpleDictionary.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String word = this.scanner.nextLine();
        if (this.simpleDictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.simpleDictionary.translate(word));
        }
    }
}
