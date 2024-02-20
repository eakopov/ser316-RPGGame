package items;

public class ItemFactory {
    public Item createItem(String itemName, String itemCondition) {
        switch (itemName.toLowerCase()) {
            case "armor":
                return new ArmorFactory().createArmor(itemName, itemCondition);
            case "health", "mana":
                return new Potion(itemName, itemCondition);
            case "money":
                return new Money(itemName);
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemName);
        }
    }
}