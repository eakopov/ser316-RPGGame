import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        Main main = new Main();

        assertEquals(3, main.random);
    }
}