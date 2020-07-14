import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }

        Item largest = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > largest.getWeight()) {
                largest = item;
            }
        }

        return largest;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int weightOfItems = 0;

        for (Item item : items) {
            weightOfItems += item.getWeight();
        }

        return weightOfItems;
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
