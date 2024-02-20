package items;

public class ItemFactory {
    public Item createItem(String itemName, String itemCondition) {
        switch (itemName.toLowerCase()) {
            case "helmet", "boots", "shield":
                return new ArmorFactory().createArmor(itemName, itemCondition);
            case "health", "mana":
                return new Potion(itemName, itemCondition);
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemName);
        }
    }
}