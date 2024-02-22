package enemies;

/**
 * The EnemyFactory class is responsible for creating different types of enemies
 * based on the specified enemy type.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */
public class EnemyFactory {

    // Attributes
    private int floor = Floor.getFloor();

    /**
     * Creates an enemy of the specified type with level based on the current floor.
     *
     * @param type The type of enemy to create (e.g., "Goblin", "Skeleton", "Orc").
     * @return An instance of the created enemy.
     * @throws IllegalArgumentException if the specified enemy type is invalid.
     */
    public Enemy createEnemy(String type) {
        // Determine the level of enemies based on the current floor
        int level = Floor.getFloor() * 2;

        // Create enemy based on the specified type
        switch (type.toLowerCase()) {
            case "goblin":
                return new Enemy("Goblin", 5, 2, floor);
            case "skeleton":
                return new Enemy("Skeleton", 10, 5, floor);
            case "orc":
                return new Enemy("Orc", 20, 10, floor);
            default:
                throw new IllegalArgumentException("Invalid enemy type: " + type);
        }
    }
}
