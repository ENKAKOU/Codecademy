public class LoopPractice {

    public static void main(String[] args) {

        String[][] wordData = {{"study", "consider", "examine", "learn"},
                {"ponder", "read", "think", "cogitate"}};
        int characterCount = 0;

        for (String[] wordRow : wordData) {
            for (String word: wordRow) {
                characterCount += word.length();
            }
        }
        System.out.println(characterCount);

        int i = 0, j = 0;
        while (i < wordData.length) {
            j = 0;
            while (j < wordData[i].length) {
                System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
                j++;
            }
            i++;
        }

//        System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");

    }
}