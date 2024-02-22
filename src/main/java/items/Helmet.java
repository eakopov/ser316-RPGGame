package items;

import java.util.Random;

/**
 * The Helmet class represents a type of armor item that can be worn by characters.
 * Helmets provide attack and defense bonuses based on their condition when used.
 *
 * @author Elizabeth Akopov
 * @version 02.21.2024
 */
public class Helmet extends Armor {

    // Name of the helmet item
    private final String name = "Helmet";
    // Condition of the helmet item
    protected String condition;

    /**
     * Constructs a new Helmet object with the specified condition.
     *
     * @param condition The condition of the helmet item.
     */
    public Helmet(String condition) {
        // Call the superclass constructor to set the name of the helmet item
        super("Helmet");
        this.condition = condition;
    }

    /**
     * Returns the condition of the helmet item.
     *
     * @return The condition of the helmet item.
     */
    @Override
    public String getCondition() {
        return condition;
    }

    /**
     * Returns the name of the helmet item.
     *
     * @return The name of the helmet item.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Applies the effect of using the helmet item.
     * The helmet item provides attack and defense bonuses based on its condition.
     */
    @Override
    public void use(int amount) {
        // Create a new Random object to generate random values
        Random random = new Random();
        // Variables to store the attack and defense bonuses
        int attackBonus;
        int defenseBonus;

        // Determine the attack and defense bonuses based on the condition of the helmet item
        switch (condition.toLowerCase()) {
            case "poor":
                // Randomly generate values for poor condition (1-3 for both attack and defense)
                attackBonus = random.nextInt(3) + 1;
                defenseBonus = random.nextInt(3) + 1;
                break;
            case "fair":
                // Randomly generate values for fair condition (2-5 for both attack and defense)
                attackBonus = random.nextInt(4) + 2;
                defenseBonus = random.nextInt(4) + 2;
                break;
            case "good":
                // Randomly generate values for good condition (4-7 for both attack and defense)
                attackBonus = random.nextInt(4) + 4;
                defenseBonus = random.nextInt(4) + 4;
                break;
            default:
                // Throw an exception if the condition is invalid
                throw new IllegalArgumentException("Invalid item condition: " + condition);
        }

        // Display the information about using the helmet item
        System.out.println("Helmet used with condition: " + condition);
        System.out.println("Attack bonus: " + attackBonus);
        System.out.println("Defense bonus: " + defenseBonus);
    }
}
