
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String printOutPut = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printOutPut + " is empty.";
        }

        StringBuilder partOfElements = new StringBuilder();
        if (this.elements.size() == 1) {
            for (String element : elements) {
                partOfElements.append(element);
            }
        } else {
            for (String element : elements) {
                partOfElements.append(element).append("\n");
            }
        }

        if (this.elements.size() == 1) {
            return printOutPut + " has " + elements.size() + " element:\n" + partOfElements;
        } else {
            return printOutPut + " has " + elements.size() + " elements:\n" + partOfElements;
        }
    }
}
