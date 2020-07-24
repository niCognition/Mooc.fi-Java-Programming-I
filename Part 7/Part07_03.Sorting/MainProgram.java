import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];

        for (int i = startIndex ; i < table.length ; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int placeholder = array[index1];

        array[index1] = array[index2];
        array[index2] = placeholder;
    }

    public static void sort(int[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
