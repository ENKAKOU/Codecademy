import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main09 {

    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();
        line.add("Mike");
        line.add("Isabel");
        line.add("Jenny");

        for(String name: line) {
            System.out.println(name);
        }

    }
}