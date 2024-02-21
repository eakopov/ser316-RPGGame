package items;

import static org.junit.Assert.*;
import org.junit.*;

public class ItemFactoryTest {

    @Test
    public void testCreateHelmet() {
        ItemFactory factory = new ItemFactory();
        Item helmet = factory.createItem("helmet", "new");

        assertTrue(helmet instanceof Armor);
        assertEquals("helmet", helmet.getName());
        assertEquals("new", helmet.getCondition());
    }

    @Test
    public void testCreateBoots() {
        ItemFactory factory = new ItemFactory();
        Item boots = factory.createItem("boots", "worn");

        assertTrue(boots instanceof Armor);
        assertEquals("boots", boots.getName());
        assertEquals("worn", boots.getCondition());
    }

    @Test
    public void testCreateShield() {
        ItemFactory factory = new ItemFactory();
        Item shield = factory.createItem("shield", "damaged");

        assertTrue(shield instanceof Armor);
        assertEquals("shield", shield.getName());
        assertEquals("damaged", shield.getCondition());
    }

    @Test
    public void testCreateHealthPotion() {
        ItemFactory factory = new ItemFactory();
        Item healthPotion = factory.createItem("health", "new");

        assertTrue(healthPotion instanceof Potion);
        assertEquals("health", healthPotion.getName());
        assertEquals("new", healthPotion.getCondition());
    }

    @Test
    public void testCreateManaPotion() {
        ItemFactory factory = new ItemFactory();
        Item manaPotion = factory.createItem("mana", "used");

        assertTrue(manaPotion instanceof Potion);
        assertEquals("mana", manaPotion.getName());
        assertEquals("used", manaPotion.getCondition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidItem() {
        ItemFactory factory = new ItemFactory();
        factory.createItem("sword", "new");
    }
}
