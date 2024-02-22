package items;

import java.util.Random;

/**
 * The Shield class represents a type of armor item that can be used by characters.
 * Shields provide defense bonuses based on their condition when used.
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class Shield extends Armor {

    // Name of the shield item
    private final String name = "Shield";
    // Condition of the shield item
    protected String condition;

    /**
     * Constructs a new Shield object with the specified condition.
     *
     * @param condition The condition of the shield item.
     */
    public Shield(String condition) {
        // Call the superclass constructor to set the name of the shield item
        super("Shield");
        this.condition = condition;
    }

    /**
     * Returns the condition of the shield item.
     *
     * @return The condition of the shield item.
     */
    @Override
    public String getCondition() {
        return condition;
    }

    /**
     * Returns the name of the shield item.
     *
     * @return The name of the shield item.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Applies the effect of using the shield item.
     * The shield item provides a defense bonus based on its condition.
     */
    @Override
    public void use(int amount) {
        // Create a new Random object to generate random values
        Random random = new Random();
        // Variable to store the defense bonus
        int defenseBonus;

        // Determine the defense bonus based on the condition of the shield item
        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3 for defense)
                defenseBonus = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5 for defense)
                defenseBonus = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7 for defense)
                defenseBonus = random.nextInt(4) + 4;
                break;
            default:
                // Throw an exception if the condition is invalid
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        // Display the information about using the shield item
        System.out.println("Shield used with condition: " + condition);
        System.out.println("Defense bonus: " + defenseBonus);
    }
}
