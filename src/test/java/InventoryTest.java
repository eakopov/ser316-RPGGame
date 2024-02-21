import static org.junit.Assert.*;
import org.junit.*;
import items.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InventoryTest {

    @Test
    public void testGetMoney() {
        Inventory inventory = new Inventory();
        assertEquals(0, inventory.getMoney());
    }

    @Test
    public void testAddMoney() {
        Inventory inventory = new Inventory();
        inventory.addMoney(100);
        assertEquals(100, inventory.getMoney());
    }

    @Test
    public void testGetPotions() {
        Inventory inventory = new Inventory();
        assertNotNull(inventory.getPotions());
    }

    @Test
    public void testAddPotion() {
        Inventory inventory = new Inventory();
        Potion potion = new Potion("Health", "Good");
        inventory.addPotion(potion);
        assertEquals(1, inventory.getPotions().size());
    }

    @Test
    public void testGetArmor() {
        Inventory inventory = new Inventory();
        assertNotNull(inventory.getArmor());
    }

    @Test
    public void testAddArmor() {
        Inventory inventory = new Inventory();
        Shield shield = new Shield("good");
        inventory.addArmor(shield);
        assertEquals(1, inventory.getArmor());
    }

    @Test
    public void testUsePotion() {
        Inventory inventory = new Inventory();
        Potion potion = new Potion("Health", "Good");
        inventory.addPotion(potion);
        inventory.usePotion(0); // Using the first potion
        assertEquals(0, inventory.getPotions().size()); // Potion should be removed after use
    }

    @Test
    public void testEquipArmor() {
        Inventory inventory = new Inventory();
        Shield shield = new Shield("good");
        inventory.addArmor(shield);
        inventory.equipArmor(0); // Equipping the first armor
        assertEquals(0, inventory.getArmor()); // Armor should be removed after equipping
    }

    @Test
    public void testDisplayInventory() {
        Inventory inventory = new Inventory();
        Potion healthPotion = new Potion("Health", "Good");
        Potion manaPotion = new Potion("Mana", "Fair");
        Helmet helmet = new Helmet("Fair");
        Boots boots = new Boots("Good");

        inventory.addMoney(100);
        inventory.addPotion(healthPotion);
        inventory.addPotion(manaPotion);
        inventory.addArmor(helmet);
        inventory.addArmor(boots);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        inventory.displayInventory();

        System.setOut(System.out);

        String expectedOutput = "Inventory:\r\nMoney: 100\r\nPotions:\r\n- Health (Good)\r\n- Mana (Fair)\r\nArmor:\r\n- Helmet (Fair)\r\n- Boots (Good)\r\n\r\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}