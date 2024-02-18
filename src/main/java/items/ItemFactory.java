package items;

public class ItemFactory {
    public Item createItem(String itemType, String itemName) {
        switch (itemType.toLowerCase()) {
            case "armor":
                return new Armor(itemName);
            case "potion":
                return new Potion(itemName);
            case "money":
                return new Money(itemName);
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemType);
        }
    }
}