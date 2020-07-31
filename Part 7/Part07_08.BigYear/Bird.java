public class Bird {
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public void observeBird() {
        this.observation += 1;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }
}
