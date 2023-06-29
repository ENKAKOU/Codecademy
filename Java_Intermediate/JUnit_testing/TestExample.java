import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestExample {
    static int a;

    @Before
    public void beforeEachTest() {
        a = 10;
    }

    @Test
    public void test1() {
        a = a - 5;
        assertThat(a, equalTo(5));
    }

    @Test
    public void test2() {
        a = a + 7;
        assertThat(a, equalTo(17));
    }

    @Test
    public void test3() {
        assertThat(a, equalTo(10));
    }
}