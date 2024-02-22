import items.Item;
import items.ItemFactory;
import items.Money;

import java.util.ArrayList;

/**
 * The Inventory class represents the player's inventory in the game, which contains money,
 * potions, and armor items. It provides methods to manage and display the inventory contents.
 *
 * @author Elizabeth Akopov
 * @version 02.18.24
 */
public class Inventory {
    private final ItemFactory items = new ItemFactory();

    private final Money money = new Money();
    private final ArrayList<Item> potions;
    private final ArrayList<Item> armor;

    /**
     * Constructs a new Inventory object with initial settings.
     * Initializes the money, potions, and armor lists.
     */
    public Inventory() {
        money.setMoney(0);
        this.potions = new ArrayList<>();
        this.armor = new ArrayList<>();
    }

    /**
     * Retrieves the amount of money in the inventory.
     *
     * @return The amount of money.
     */
    public int getMoney() {
        return money.getMoney();
    }

    /**
     * Adds money to the inventory.
     *
     * @param amount The amount of money to add.
     */
    public void addMoney(int amount) {
        money.add(amount);
    }

    /**
     * Retrieves the list of potions in the inventory.
     *
     * @return The list of potions.
     */
    public ArrayList<Item> getPotions() {
        return potions;
    }

    /**
     * Adds a potion to the inventory.
     *
     * @param potion The potion to add.
     */
    public void addPotion(Item potion) {
        this.potions.add(potion);
    }

    /**
     * Retrieves the number of armor items in the inventory.
     *
     * @return The number of armor items.
     */
    public int getArmor() {
        return armor.size();
    }

    /**
     * Adds an armor item to the inventory.
     *
     * @param armor The armor item to add.
     */
    public void addArmor(Item armor) {
        this.armor.add(armor);
    }

    /**
     * Displays the contents of the inventory, including money, potions, and armor items.
     */
    public void displayInventory() {
        System.out.println("Inventory:");
        System.out.println("Money: " + money.getMoney());
        System.out.println("Potions:");
        for (Item potion : potions) {
            System.out.println("- " + potion.getName() + " (" + potion.getCondition() + ")");
        }
        System.out.println("Armor:");
        for (Item armor : armor) {
            System.out.println("- " + armor.getName() + " (" + armor.getCondition() + ")");
        }
        System.out.println();
    }

    /**
     * Uses a potion from the inventory at the specified index.
     *
     * @param index The index of the potion to use.
     */
    public void usePotion(int index) {
        if (index < 0 || index >= potions.size()) {
            System.out.println("Invalid potion index.");
            return;
        }

        Item potion = potions.remove(index);
        System.out.println("Using potion: " + potion.getName());
        potion.use(1);
    }

    /**
     * Equips an armor item from the inventory at the specified index.
     *
     * @param index The index of the armor item to equip.
     */
    public void equipArmor(int index) {
        if (index < 0 || index >= armor.size()) {
            System.out.println("Invalid armor index.");
            return;
        }

        Item armorItem = armor.remove(index);
        System.out.println("Equipping armor: " + armorItem.getName() + " (" + armorItem.getCondition() + ")");
        armorItem.use(1);
    }
}
