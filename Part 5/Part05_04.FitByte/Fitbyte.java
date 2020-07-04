public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    //If it was up to me I'd have private double targetHeartRate field
    //But the tests doesn't allow it
    //Could also make the method return ((206.3 - (0.711 * this.age)) - this.restingHeartRate)
    //                                  * percentageOfMaximum + this.restingHeartRate;
    //And remove the extra variables.
    //Not quite sure what's best. I prefer this way.
    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = (206.3 - (0.711 * this.age));
        double targetHeartRate = (maxHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;

        return targetHeartRate;
    }
}
