import items.*;
import java.util.ArrayList;

public class Inventory {
    private int money;
    private ArrayList<Item> potions;
    private ArrayList<Armor> armor;

    public Inventory() {
        this.money = 0;
        this.potions = new ArrayList<>();
        this.armor = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    public ArrayList<Item> getPotions() {
        return potions;
    }

    public void addPotion(Item potion) {
        this.potions.add(potion);
    }

    public ArrayList<Armor> getArmor() {
        return armor;
    }

    public void addArmor(Armor armor) {
        this.armor.add(armor);
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        System.out.println("Money: " + money);
        System.out.println("Potions:");
        for (Item potion : potions) {
            System.out.println("- " + potion.getName());
        }
        System.out.println("Armor:");
        for (Armor armor : armor) {
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

        Armor armorItem = armor.remove(index);
        System.out.println("Equipping armor: " + armorItem.getName() + " (" + armorItem.getCondition() + ")");
        // Implement armor equipping logic here
    }
}
