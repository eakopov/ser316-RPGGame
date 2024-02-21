package items;

import static org.junit.Assert.*;
import org.junit.*;

public class HelmetTest {

    @Test
    public void testGetCondition() {
        Helmet helmet = new Helmet("fair");
        assertEquals("fair", helmet.getCondition());
    }

    @Test
    public void testGetName() {
        Helmet helmet = new Helmet("good");
        assertEquals("Helmet", helmet.getName());
    }

    @Test
    public void testUsePoorCondition() {
        Helmet helmet = new Helmet("poor");
        helmet.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test
    public void testUseFairCondition() {
        Helmet helmet = new Helmet("fair");
        helmet.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test
    public void testUseGoodCondition() {
        Helmet helmet = new Helmet("good");
        helmet.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUseInvalidCondition() {
        Helmet helmet = new Helmet("invalid");
        helmet.use(0); // Amount parameter is not used in this case
    }
}
