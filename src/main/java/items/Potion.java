package items;

import characters.Character; // Import the Character class for interacting with character stats

import java.util.Random; // Import the Random class for generating random values

/**
 * The Potion class represents a potion item in the game.
 * Potions can be used to restore health or mana to a character.
 * Each potion has a name and a condition that determines the amount of health or mana it restores.
 * Potions are used by characters to replenish their health or mana during gameplay.
 *
 * @author Elizabeth Akopov
 * @version 02.19.24
 */
public class Potion extends Item {
    // The condition of the potion (e.g., poor, fair, good)
    private final String condition;
    // The name of the potion
    private final String name;

    // The amount of health or mana restored by the potion
    private int amount;

    /**
     * Constructor to create a Potion object with a specified name and condition.
     *
     * @param name      The name of the potion.
     * @param condition The condition of the potion (poor, fair, good).
     */
    public Potion(String name, String condition) {
        super(name); // Call the superclass constructor
        this.name = name;
        this.condition = condition;
    }

    /**
     * Get the name of the potion.
     *
     * @return The name of the potion.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Get the condition of the potion.
     *
     * @return The condition of the potion.
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Use the potion to restore health or mana to the character.
     * The amount of health or mana restored depends on the potion's condition.
     *
     * @param amount The amount of health or mana restored by the potion.
     */
    @Override
    public void use(int amount) {
        Random random = new Random(); // Create a new Random object

        // Determine the amount of health or mana restored based on the potion's condition
        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3)
                amount = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5)
                amount = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7)
                amount = random.nextInt(4) + 4;
                break;
            default:
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        // Restore health or mana to the character based on the type of potion
        if (name.equalsIgnoreCase("health")) {
            Character.setHealth(Character.getHealth() + amount);
            System.out.println("Your health is now: " + Character.getHealth());
        }
        if (name.equalsIgnoreCase("mana")) {
            Character.setMana(Character.getMana() + amount);
            System.out.println("Your mana is now: " + Character.getMana());
        }
    }
}
