import enemies.Floor;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDisplayItems() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Shop.displayItems();

        System.setOut(System.out);

        String expectedOutput = "Items Available in the Shop:\r\n" +
                "Each item is 4 money or all 3 for 10\r\n" +
                "1. Armor\r\n" +
                "2. Health Potion\r\n" +
                "3. Mana Potion\r\n" +
                "4. Buy All Items10 money\r\n" +
                "5. Exit shop\r\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}