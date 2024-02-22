import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Inventory inventory;

    @Before
    public void setUp() {
        inventory = new Inventory();
    }

    @After
    public void tearDown() {
        inventory = null;
    }

//    @Test
//    public void testDisplayItems() {
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        Shop.displayItems();
//
//        System.setOut(System.out);
//
//        String expectedOutput = "Items Available in the Shop:\r\n" +
//                "Each item is 4 money or all 3 for 10\r\n" +
//                "1. Armor\r\n" +
//                "2. Health Potion\r\n" +
//                "3. Mana Potion\r\n" +
//                "4. Buy All Items10 money\r\n" +
//                "5. Exit shop\r\n";
//
//        String output = outputStream.toString();
//        assertEquals(expectedOutput, output);
//    }

    @Test
    public void testBuyItem_Armor() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Shop.buyItem(1, inventory);

        System.setOut(System.out);

        assertEquals(-4, inventory.getMoney());
        assertEquals(1, inventory.getArmor());
    }

    @Test
    public void testBuyItem_HealthPotion() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Shop.buyItem(2, inventory);

        System.setOut(System.out);

        assertEquals(-4, inventory.getMoney());
        assertEquals(1, inventory.getPotions().size());
        assertEquals("health", inventory.getPotions().get(0).getName());
    }

    @Test
    public void testBuyItem_ManaPotion() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Shop.buyItem(3, inventory);

        System.setOut(System.out);

        assertEquals(-4, inventory.getMoney());
        assertEquals(1, inventory.getPotions().size());
        assertEquals("mana", inventory.getPotions().get(0).getName());
    }

    @Test
    public void testBuyItem_AllItems() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Shop.buyItem(4, inventory);

        System.setOut(System.out);

        assertEquals(-10, inventory.getMoney());
        assertEquals(1, inventory.getArmor());
        assertEquals(2, inventory.getPotions().size());
        assertEquals(1, inventory.getArmor());
        assertEquals("health", inventory.getPotions().get(0).getName());
        assertEquals("mana", inventory.getPotions().get(1).getName());
    }
}
