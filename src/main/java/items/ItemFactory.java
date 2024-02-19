package items;

public class ItemFactory {
    public Item createItem(String itemName, String itemCondition) {
        switch (itemName.toLowerCase()) {
            case "armor":
                return new ArmorFactory().createArmor(itemName, itemCondition);
            case "potion":
                //return new Potion(itemName, itemCondition);
            case "money":
                //return new Money(itemName, itemCondition);
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemName);
        }
    }
}