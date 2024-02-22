package items;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BootsTest {

    @Test
    public void testGetCondition() {
        Boots boots = new Boots("fair");
        assertEquals("fair", boots.getCondition());
    }

    @Test
    public void testGetName() {
        Boots boots = new Boots("good");
        assertEquals("Boots", boots.getName());
    }

    @Test
    public void testUsePoorCondition() {
        Boots boots = new Boots("poor");
        boots.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test
    public void testUseFairCondition() {
        Boots boots = new Boots("fair");
        boots.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test
    public void testUseGoodCondition() {
        Boots boots = new Boots("good");
        boots.use(0); // Amount parameter is not used in this case
        // Since the use method has a random element, we cannot assert specific values here
        // We can only check if the method completes successfully without throwing exceptions
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUseInvalidCondition() {
        Boots boots = new Boots("invalid");
        boots.use(0); // Amount parameter is not used in this case
    }
}
