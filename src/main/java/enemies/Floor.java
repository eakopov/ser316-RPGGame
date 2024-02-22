package enemies;

/**
 * The Floor class represents the current floor level in the game.
 * It provides methods to get and set the current floor level.
 *
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class Floor {

    // Attributes
    public static int floor;

    /**
     * Gets the current floor level.
     *
     * @return The current floor level.
     */
    public static int getFloor() {
        return floor;
    }

    /**
     * Sets the current floor level.
     *
     * @param floor The floor level to set.
     */
    public static void setFloor(int floor) {
        Floor.floor = floor;
    }
}
