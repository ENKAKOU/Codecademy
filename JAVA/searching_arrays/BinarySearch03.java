public class BinarySearch03 {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while(right > left) {
            int mid = Math.floorDiv(left + right, 2);   //计算数组中间索引的值
            int midValue = arr[mid];

            if (midValue == target) {
                return mid;
            } else if (target > midValue) {   //如果目标值在右侧
                left = mid + 1;   //左边的起始位置是中间索引+1，作为下次比较的范围
            } else {
                right = mid;   //如果目标值在左侧，则右侧的索引被赋予中间索引值，作为下次遍历的终点。
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 8;

        System.out.println(search(searchable, target));

    }
}