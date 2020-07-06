public class Dice {
    private int numberOfSides;
    private int totalValueOfDice;

    public Dice (int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int throwDice() {
        return (int) (this.numberOfSides * Math.random());
    }

    public String toString() {
        return "This dice is a " +
                numberOfSides + "-sided dice." + "\n" +
                "It's lowest value is " + 1 + " and highest value is " + numberOfSides;
    }

}
