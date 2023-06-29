package java_english.recursion;

public class Factorial4 {

    public static int recursiveFactorial(int n) {
        if (n > 0) {
            System.out.println("Execution context: " + n);

            return n * recursiveFactorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int recursiveSolution = recursiveFactorial(4);
        System.out.println(recursiveSolution);

    }
}