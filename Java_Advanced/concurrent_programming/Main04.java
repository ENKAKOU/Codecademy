import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;

public class Main04 {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        List<String> textLineList = Files.readAllLines(file.toPath());
        System.out.println("[ Parallel streaming from list: ]");
        textLineList.parallelStream().forEach(System.out::println);

        Stream<String> textLineStream = Files.lines(file.toPath());
        System.out.println("[ Parallel streaming from stream: ]");

        textLineStream.parallel().forEach(System.out::println);
        textLineStream.close();

    }
}