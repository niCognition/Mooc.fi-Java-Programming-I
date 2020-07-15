import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            commandCenter(input);
        }
    }

    public void commandCenter(String input) {
        switch (input) {
            case "add":
                add();
                break;
            case "list":
                list();
                break;
            case "remove":
                remove();
                break;
        }
    }

    public void add() {
        System.out.println("To add: ");
        String task = this.scanner.nextLine();

        this.todoList.add(task);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int taskNumber = Integer.parseInt(this.scanner.nextLine());

        this.todoList.remove(taskNumber);
    }
}
