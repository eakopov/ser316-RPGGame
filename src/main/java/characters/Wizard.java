package characters;

/**
 * The Wizard class represents a character of the Wizard class in the game.
 * Wizards have unique stats and abilities based on their class and race.
 * They inherit from the Character class.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */
public class Wizard extends Character {

    /**
     * Constructor to create a Wizard character with specified attributes.
     *
     * @param name      The name of the Wizard character.
     * @param sex       The sex of the Wizard character (male/female).
     * @param height    The height of the Wizard character (short/average/tall).
     * @param weight    The weight/build of the Wizard character (slim/average/large).
     * @param characterRace The race of the Wizard character (dwarf/elf/human/orc/tiefling).
     */
    public Wizard(String name, String sex, String height, String weight, String characterRace) {
        super(name, sex, height, weight, "Wizard", characterRace);
    }

    /**
     * Initializes the stats and abilities of the Wizard character based on their class and race.
     * This method sets the attack, mana, defense, speed, and skill of the Wizard character.
     * The values are determined based on the character's race.
     * Supported races include Dwarf, Elf, Human, Orc, and Tiefling.
     */
    @Override
    public void initializeStats() {
        this.attack = 10;
        mana = 15;
        this.defense = 5;

        // Create character based on race
        switch (characterRace.toLowerCase()) {
            case "dwarf":
                this.speed = 4;
                this.skill = "Gains 2x money each fight won.";
                break;
            case "elf":
                this.speed = 10;
                this.skill = "Recovers 2HP after every 5 floors.";
                break;
            case "human":
                this.speed = 7;
                this.skill = "+5 starting HP";
                break;
            case "orc":
                this.speed = 5;
                this.skill = "+5 starting defense";
                break;
            case "tiefling":
                this.speed = 9;
                this.skill = "+5 starting mana.";
                break;
            default:
                throw new IllegalArgumentException("Invalid character race: " + characterRace);
        }
    }

}
