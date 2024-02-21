import items.Item;
import items.ItemFactory;
import items.Money;

import java.util.ArrayList;

public class Inventory {
    private final ItemFactory items = new ItemFactory();

    private final Money money = new Money();
    private final ArrayList<Item> potions;
    private final ArrayList<Item> armor;

    public Inventory() {
        money.setMoney(0);
        this.potions = new ArrayList<>();
        this.armor = new ArrayList<>();
    }

    public int getMoney() {
        return money.getMoney();
    }

    public void addMoney(int amount) {
        money.add(amount);
    }

    public ArrayList<Item> getPotions() {
        return potions;
    }

    public void addPotion(Item potion) {
        this.potions.add(potion);
    }

    public ArrayList<Item> getArmor() {
        return armor;
    }

    public void addArmor(Item armor) {
        this.armor.add(armor);
    }

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
    }

    public void usePotion(int index) {
        if (index < 0 || index >= potions.size()) {
            System.out.println("Invalid potion index.");
            return;
        }

        Item potion = potions.remove(index);
        System.out.println("Using potion: " + potion.getName());
        potion.use(1);
    }

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
