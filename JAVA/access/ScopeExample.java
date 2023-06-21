package java_english.access;

public class ScopeExample {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        int sum = 0; // 将sum变量的声明移至循环外部

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}
