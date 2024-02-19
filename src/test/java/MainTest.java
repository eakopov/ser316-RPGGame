import enemies.Floor;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        Main main = new Main();
        int floor = Floor.getFloor();
        assertEquals(1, floor);
    }
}