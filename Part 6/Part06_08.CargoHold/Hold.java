import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int weightOfSuitcases = 0;

        for (Suitcase suitcase : suitcases) {
            weightOfSuitcases += suitcase.totalWeight();
        }

        return weightOfSuitcases;
    }

    public String toString() {
        if (this.suitcases.size() == 0) {
            return "no suitcases (" + this.totalWeight() + " kg)";
        } else if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";
        }
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
