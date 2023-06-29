
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import java.io.IOException;

public class TestExample02 {
    static File file;
    static FileWriter w;
    static Scanner s;

    @Before
    public void beforeEachTest() throws IOException {
        file = new File("test.txt");
        w = new FileWriter("test.txt");
        s = new Scanner(file);
    }

    @Test
    public void test1() throws IOException {
        w.write("Testing testing 1 2 3!");
        w.close();
        assertThat(s.nextLine(), equalTo("Testing testing 1 2 3!"));
    }

    @Test
    public void test2() throws IOException {
        w.write("Poking poking 4 5 6!");
        w.close();
        assertThat(s.nextLine(), equalTo("Poking poking 4 5 6!"));
    }

    @After
    public void afterEachTest() throws IOException {
        s.close();
    }
}