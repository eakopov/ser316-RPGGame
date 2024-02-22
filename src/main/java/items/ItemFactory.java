package items;

/**
 * The ItemFactory class is responsible for creating items based on their type and condition.
 * It utilizes other factories to create specific types of items.
 *
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class ItemFactory {

    /**
     * Creates an item based on its type and condition.
     *
     * @param itemName      The name of the item to create.
     * @param itemCondition The condition of the item.
     * @return An instance of the created item.
     * @throws IllegalArgumentException if the item type is invalid.
     */
    public Item createItem(String itemName, String itemCondition) {
        switch (itemName.toLowerCase()) {
            case "helmet":
            case "boots":
            case "shield":
                // Create armor items using the ArmorFactory
                return new ArmorFactory().createArmor(itemName, itemCondition);
            case "health":
            case "mana":
                // Create potion items
                return new Potion(itemName, itemCondition);
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemName);
        }
    }
}
