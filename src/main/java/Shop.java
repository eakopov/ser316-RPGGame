import enemies.Floor;
import items.*;

import java.util.ArrayList;
import java.util.Random;

public class Shop {
    private final int ITEM_PRICE = 4;
    private static final int ALL_ITEMS_PRICE = 10;

    public static void displayItems() {
        System.out.println("Items Available in the Shop:");
        System.out.println("1. Armor");
        System.out.println("2. Health Potion");
        System.out.println("3. Mana Potion");
        System.out.println("4. Buy All Items for " + ALL_ITEMS_PRICE + " money");
        System.out.println("5. Exit shop");
    }

    public void buyItem(int choice, Inventory inventory) {
        switch (choice) {
            case 1:
                Armor armor = returnArmor();
                System.out.println("You bought " + armor.getName() + " for " + ITEM_PRICE + " money.");
                inventory.addArmor(armor);
                inventory.addMoney(-ITEM_PRICE);
                break;
            case 2:
                System.out.println("You bought a Health Potion for " + ITEM_PRICE + " money.");
                inventory.addPotion(healthPotion());
                inventory.addMoney(-ITEM_PRICE);
                break;
            case 3:
                System.out.println("You bought a Mana Potion for " + ITEM_PRICE + " money.");
                inventory.addPotion(manaPotion());
                inventory.addMoney(-ITEM_PRICE);
                break;
            case 4:
                System.out.println("You bought all items for " + ALL_ITEMS_PRICE + " money.");
                Armor armorItem = returnArmor();
                inventory.addArmor(armorItem);
                inventory.addPotion(healthPotion());
                inventory.addPotion(manaPotion());
                inventory.addMoney(-ALL_ITEMS_PRICE);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private Armor returnArmor() {
        Random random = new Random();

        int randomNumber = random.nextInt(3) + 1;
        String condition = generateCondition();

        switch (randomNumber) {
            case 1:
                return new Helmet(condition);
            case 2:
                return new Boots(condition);
            case 3:
                return new Shield(condition);
            default:
                System.out.println("Error: Random Number Generator generating bad numbers :(");
                return null;
        }
    }

    private String generateCondition() {
        if (Floor.getFloor() < 10) {
            return "poor";
        } else if (Floor.getFloor() < 50) {
            return "fair";
        } else {
            return "good";
        }
    }

    private Potion healthPotion() {
        String condition = generateCondition();
        String type = "health";
        return new Potion(type, condition);
    }

    private Potion manaPotion() {
        String condition = generateCondition();
        String type = "mana";
        return new Potion(type, condition);
    }
}
