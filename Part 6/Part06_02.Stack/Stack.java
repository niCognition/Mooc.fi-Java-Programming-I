import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public String take() {
        return this.stack.remove(this.stack.size() - 1);
    }

    public ArrayList<String> values() {
        return this.stack;
    }
}
