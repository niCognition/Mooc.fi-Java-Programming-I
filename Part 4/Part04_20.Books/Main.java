import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.println("");

        System.out.println("What information will be printed? ");
        String outputFormat = scanner.nextLine();

        for (Book book : books) {
            switch (outputFormat) {
                case "everything":
                    System.out.println(book);
                    break;
                case "name":
                    System.out.println(book.getTitle());
                    break;
                case "pages":
                    System.out.println(book.getPages());
                    break;
            }
        }

    }
}
