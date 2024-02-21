package items;

import static org.junit.Assert.*;
import org.junit.*;

public class ShieldTest {

    @Test
    public void testGetCondition() {
        Shield shield = new Shield("fair");
        assertEquals("fair", shield.getCondition());
    }

    @Test
    public void testGetName() {
        Shield shield = new Shield("good");
        assertEquals("Shield", shield.getName());
    }

    @Test
    public void testUsePoorCondition() {
        Shield shield = new Shield("poor");
        shield.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test
    public void testUseFairCondition() {
        Shield shield = new Shield("fair");
        shield.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test
    public void testUseGoodCondition() {
        Shield shield = new Shield("good");
        shield.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUseInvalidCondition() {
        Shield shield = new Shield("invalid");
        shield.use(0); // Amount parameter is not used in this case
    }
}
