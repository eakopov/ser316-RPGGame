package skills;

/**
 * The PartSkill class represents a specific implementation of the Strategy interface,
 * providing concrete implementations for various skills that can be executed in the game.
 *
 * @author Elizabeth Akopov
 * @version 02.21.2024
 */
public class PartSkill implements Strategy {

    /**
     * Executes the specified skill.
     *
     * @param skill The skill to be executed.
     */
    @Override
    public void skill(String skill) {
        switch (skill) {
            case "Gain 2x money!":
                // Implement logic for the skill "Gain 2x money!"
                break;
            case "HP decreased by 2!":
                // Implement logic for the skill "HP decreased by 2!"
                break;
            case "Extra enemies!":
                // Implement logic for the skill "Extra enemies!"
                break;
            case "Attack increased by 2!":
                // Implement logic for the skill "Attack increased by 2!"
                break;
            default:
                throw new IllegalArgumentException("Invalid skill");
        }
    }
}
