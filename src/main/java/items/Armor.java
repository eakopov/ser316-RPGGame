package items;

/**
 * The Armor class represents an abstract armor item in the game.
 * It extends the Item class and provides methods to get the condition and name of the armor.
 * @author Elizabeth Akopov
 * @version 02.18.2024
 */
public abstract class Armor extends Item {

    /**
     * Constructor to initialize the armor with a name.
     *
     * @param name The name of the armor.
     */
    public Armor(String name) {
        super(name);
    }

    /**
     * Abstract method to get the condition of the armor.
     *
     * @return The condition of the armor.
     */
    public abstract String getCondition();

    /**
     * Abstract method to get the name of the armor.
     *
     * @return The name of the armor.
     */
    public abstract String getName();
}
