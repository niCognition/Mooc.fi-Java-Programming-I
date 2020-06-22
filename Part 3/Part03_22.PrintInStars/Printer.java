
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int index = 0;
        int numberOfStars;
        while (index < array.length) {
            numberOfStars = array[index];
            for (int i = 0; i < numberOfStars; i++) {
                System.out.print("*");
            }

            System.out.println("");

            index++;
        }
    }

}
