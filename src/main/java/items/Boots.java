package items;

import java.util.Random;

/**
 * The Boots class represents a type of armor item that can be worn by characters.
 * Boots provide an attack bonus based on their condition when used.
 *
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class Boots extends Armor {

    // Name of the boots item
    private final String name = "Boots";
    // Condition of the boots item
    protected String condition;

    /**
     * Constructs a new Boots object with the specified condition.
     *
     * @param condition The condition of the boots item.
     */
    public Boots(String condition) {
        // Call the superclass constructor to set the name of the boots item
        super("Boots");
        this.condition = condition;
    }

    /**
     * Returns the condition of the boots item.
     *
     * @return The condition of the boots item.
     */
    @Override
    public String getCondition() {
        return condition;
    }

    /**
     * Returns the name of the boots item.
     *
     * @return The name of the boots item.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Applies the effect of using the boots item.
     * The boots item provides an attack bonus based on its condition.
     */
    @Override
    public void use(int amount) {
        // Create a new Random object to generate random values
        Random random = new Random();
        // Variable to store the attack bonus
        int attackBonus;

        // Determine the attack bonus based on the condition of the boots item
        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3 for attack)
                attackBonus = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5 for attack)
                attackBonus = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7 for attack)
                attackBonus = random.nextInt(4) + 4;
                break;
            default:
                // Throw an exception if the condition is invalid
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        // Display the information about using the boots item
        System.out.println("Boots used with condition: " + condition);
        System.out.println("Attack bonus: " + attackBonus);
    }
}
