import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        Main main = new Main();

        assertEquals(0, main.floor);
    }
}