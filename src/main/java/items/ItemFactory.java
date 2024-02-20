package items;

public class ItemFactory {
    public Item createItem(String itemName, String itemCondition) {
        switch (itemName.toLowerCase()) {
            case "helmet":
                return new ArmorFactory().createArmor(itemName, itemCondition);
            case "boots":
                return new ArmorFactory().createArmor(itemName, itemCondition);
            case "shield":
                return new ArmorFactory().createArmor(itemName, itemCondition);
            case "health":
                return new Potion(itemName, itemCondition);
            case "mana":
                return new Potion(itemName, itemCondition);
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemName);
        }
    }
}