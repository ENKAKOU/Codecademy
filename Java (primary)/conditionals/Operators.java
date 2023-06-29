public class Operators {

    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        boolean ex1 = !(a == 7 && (b >= a || a != a));
        boolean ex2 = a == b || !(b > 3);
        boolean ex3 = !(b <= a && b != a + b);

    }
}