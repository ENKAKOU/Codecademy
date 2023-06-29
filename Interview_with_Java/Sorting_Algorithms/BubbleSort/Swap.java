import java.util.Arrays;

public class Swap {

    public static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }

    public static void main(String[] args) {
        int[] example = {8, 12, 20, 14, 53};
        swap(example, 2, 3);
        System.out.println(Arrays.toString(example));

    }
}