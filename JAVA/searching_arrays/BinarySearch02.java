public class BinarySearch02 {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int mid = Math.floorDiv(left + right, 2);
        return -1;
    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 41;

        System.out.println(search(searchable, target));

    }
}