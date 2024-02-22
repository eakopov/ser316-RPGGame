package skills;

/**
 * The CharSkill class implements the Strategy interface and represents various character skills in the game.
 * Each skill provides a different benefit or ability to the character.
 * This class defines the behavior of each skill when activated.
 *
 * @author Elizabeth Akopov
 * @version 02.21.2024
 */
public class CharSkill implements Strategy {

    /**
     * Activates the specified character skill and applies its effect.
     *
     * @param skill The skill to activate.
     */
    @Override
    public void skill(String skill) {
        switch (skill) {
            case "Gains 2x money each fight won.":
                // Logic to apply the effect of gaining double money after each won fight
                break;
            case "Recovers 2HP after every 5 floors.":
                // Logic to apply the effect of recovering 2 HP after every 5 floors
                break;
            case "+5 starting HP":
                // Logic to apply the effect of increasing starting HP by 5
                break;
            case "+5 starting defense":
                // Logic to apply the effect of increasing starting defense by 5
                break;
            case "+5 starting mana.":
                // Logic to apply the effect of increasing starting mana by 5
                break;
            default:
                throw new IllegalArgumentException("Invalid skill");
        }
    }
}
