public class Introduction {

    public static void main(String[] args) {

        int[][] intMatrix = {
                { 4,  6,  8, 10, 12, 14, 16},
                {18, 20, 22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40, 42, 44},
                {46, 48, 50, 52, 54, 56, 58},
                {60, 62, 64, 66, 68, 70, 79}
        };
        int numSubArrays = intMatrix.length;
        int subArrayLength = intMatrix[0].length;
        int columns = subArrayLength;
        int rows = numSubArrays;
        int sum = 0;

        for(int i=0; i<intMatrix.length; i++) {
            for(int j = 0; j < intMatrix[i].length; j++) {
                sum+=intMatrix[i][j];
            }
        }

        System.out.println(sum);

    }
}
