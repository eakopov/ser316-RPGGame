package items;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemFactoryTest {

    @Test
    public void testCreateHelmet() {
        ItemFactory factory = new ItemFactory();
        Item helmet = factory.createItem("helmet", "new");

        assertTrue(helmet instanceof Armor);
        assertEquals("Helmet", helmet.getName());
        assertEquals("new", helmet.getCondition());
    }

    @Test
    public void testCreateBoots() {
        ItemFactory factory = new ItemFactory();
        Item boots = factory.createItem("boots", "good");

        assertTrue(boots instanceof Armor);
        assertEquals("Boots", boots.getName());
        assertEquals("good", boots.getCondition());
    }

    @Test
    public void testCreateShield() {
        ItemFactory factory = new ItemFactory();
        Item shield = factory.createItem("shield", "poor");

        assertTrue(shield instanceof Armor);
        assertEquals("Shield", shield.getName());
        assertEquals("poor", shield.getCondition());
    }

    @Test
    public void testCreateHealthPotion() {
        ItemFactory factory = new ItemFactory();
        Item healthPotion = factory.createItem("health", "fair");

        assertTrue(healthPotion instanceof Potion);
        assertEquals("health", healthPotion.getName());
        assertEquals("fair", healthPotion.getCondition());
    }

    @Test
    public void testCreateManaPotion() {
        ItemFactory factory = new ItemFactory();
        Item manaPotion = factory.createItem("mana", "good");

        assertTrue(manaPotion instanceof Potion);
        assertEquals("mana", manaPotion.getName());
        assertEquals("good", manaPotion.getCondition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidItem() {
        ItemFactory factory = new ItemFactory();
        factory.createItem("sword", "new");
    }
}
