import java.util.*;
import java.util.stream.*;

public class Review {

    public static void main(String args[]) {
        List<String> welcome = Arrays.asList("You","did","it!");
        welcome.stream().forEach(y->System.out.println(y));

    }
}