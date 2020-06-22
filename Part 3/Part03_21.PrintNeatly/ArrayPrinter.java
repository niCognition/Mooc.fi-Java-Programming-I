
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0;
        boolean last = false;
        while (index < array.length) {
            int number = array[index];

            if (index == array.length - 1) {
                last = true;
            }

            if (last) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
            }
            index = index + 1;
        }
    }
}
