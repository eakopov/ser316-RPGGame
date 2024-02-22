package items;

/**
 * The Item class is an abstract class representing an item in the game.
 * Items can have different types and conditions.
 * This class provides basic functionality for items.
 *
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public abstract class Item {
    protected String name; // The name of the item

    /**
     * Constructor to create an Item with a specified name.
     *
     * @param name The name of the item.
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Abstract method to get the name of the item.
     *
     * @return The name of the item.
     */
    public abstract String getName();

    /**
     * Abstract method to get the condition of the item.
     * The condition can vary depending on the type of the item.
     *
     * @return The condition of the item.
     */
    public abstract String getCondition();

    /**
     * Abstract method to use the item.
     * This method performs actions specific to the item when used.
     *
     * @param amount The amount of the item to use (if applicable).
     */
    public abstract void use(int amount);
}
