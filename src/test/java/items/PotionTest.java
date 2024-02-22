package items;

import characters.Character;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PotionTest {

    @Before
    public void setUp() {
        Character.setHealth(100); // Reset health before each test
        Character.setMana(50); // Reset mana before each test
    }

    @Test
    public void testConstructor() {
        Potion potion = new Potion("Health", "Good");
        assertEquals("Health", potion.getName());
        assertEquals("Good", potion.getCondition());
    }

    @Test
    public void testUseHealthPotion() {
        Potion healthPotion = new Potion("Health", "Good");
        healthPotion.use(0);
        assertTrue(Character.getHealth() > 100); // Health should increase
    }

    @Test
    public void testUseManaPotion() {
        Potion manaPotion = new Potion("Mana", "Fair");
        manaPotion.use(0);
        assertTrue(Character.getMana() > 50); // Mana should increase
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUseInvalidCondition() {
        Potion potion = new Potion("Health", "InvalidCondition");
        potion.use(0);
    }

}
