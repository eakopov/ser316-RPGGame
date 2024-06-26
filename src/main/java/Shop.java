import enemies.Floor;
import items.Item;
import items.ItemFactory;
import items.Potion;

import java.util.Random;

/**
 * The Shop class represents a shop where players can buy items such as armor
 * and potions using money. It provides methods to display available items,
 * handle item purchases, and generate random item conditions.
 *
 * @author Elizabeth Akopov
 * @version 02.20.24
 */
public class Shop {
    private static final int itemPrice = 4;
    private static final int priceAll = 10;

    protected static ItemFactory item = new ItemFactory();

    /**
     * Displays the available items in the shop along with their prices.
     */
    public static void displayItems() {
        System.out.println("Items Available in the Shop:");
        System.out.println("Each item is 4 money or all 3 for 10");
        System.out.println("1. Armor");
        System.out.println("2. Health Potion");
        System.out.println("3. Mana Potion");
        System.out.println("4. Buy All Items" + priceAll + " money");
        System.out.println("5. Exit shop");
    }

    /**
     * Processes the purchase of an item based on the player's choice.
     *
     * @param choice    The player's choice of item to buy.
     * @param inventory The player's inventory to add the purchased item.
     */
    public static void buyItem(int choice, Inventory inventory) {
        switch (choice) {
            case 1:
                Item armor = item.createItem(returnArmor(), generateCondition());
                System.out.println("You bought " + armor.getName() + " for " + itemPrice + " money.");
                inventory.addArmor(armor);
                inventory.addMoney(-itemPrice);
                break;
            case 2:
                System.out.println("You bought a Health Potion for " + itemPrice + " money.");
                String condition = generateCondition();
                Potion health = new Potion("health", condition);
                inventory.addPotion(health);
                inventory.addMoney(-itemPrice);
                break;
            case 3:
                System.out.println("You bought a Mana Potion for " + itemPrice + " money.");
                String condition1 = generateCondition();
                Potion mana = new Potion("mana", condition1);
                inventory.addPotion(mana);
                inventory.addMoney(-itemPrice);
                break;
            case 4:
                System.out.println("You bought all items for " + priceAll + " money.");
                Item armor1 = item.createItem(returnArmor(), generateCondition());
                String condition2 = generateCondition();
                String condition3 = generateCondition();
                Potion health1 = new Potion("health", condition2);
                Potion mana1 = new Potion("mana", condition3);
                inventory.addArmor(armor1);
                inventory.addPotion(health1);
                inventory.addPotion(mana1);
                inventory.addMoney(-priceAll);
                break;
            default:
                Main.menu();
        }
    }

    /**
     * Returns a randomly selected armor type (helmet, boots, or shield).
     *
     * @return A randomly selected armor type.
     */
    private static String returnArmor() {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

        switch (randomNumber) {
            case 1:
                return "helmet";
            case 2:
                return "boots";
            case 3:
                return "shield";
            default:
                System.out.println("Error: Random Number Generator generating bad numbers :(");
                return null;
        }
    }

    /**
     * Generates a condition (poor, fair, or good) based on the current floor level.
     *
     * @return The generated condition.
     */
    private static String generateCondition() {
        if (Floor.getFloor() < 10) {
            return "poor";
        } else if (Floor.getFloor() < 50) {
            return "fair";
        } else {
            return "good";
        }
    }
}
