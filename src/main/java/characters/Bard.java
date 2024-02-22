package characters;

/**
 * Bard class represents a character of the Bard class in the game.
 * Bard characters have unique stats and abilities based on their class and race.
 * They inherit from the Character class.
 *
 * @author Elizabeth Akopov
 * @version 02.20.2024
 */
public class Bard extends Character {

    /**
     * Constructor to create a Bard character with specified attributes.
     *
     * @param name      The name of the Bard character.
     * @param sex       The sex of the Bard character (male/female).
     * @param height    The height of the Bard character (short/average/tall).
     * @param weight    The weight/build of the Bard character (slim/average/large).
     * @param characterRace The race of the Bard character (dwarf/elf/human/orc/tiefling).
     */
    public Bard(String name, String sex, String height, String weight, String characterRace) {
        super(name, sex, height, weight, "Bard", characterRace); // Call the superclass constructor
    }

    /**
     * Initializes the stats and abilities of the Bard character based on their class and race.
     * This method sets the attack, mana, defense, speed, and skill of the Bard character.
     * The values are determined based on the character's race.
     * Supported races include Dwarf, Elf, Human, Orc, and Tiefling.
     */
    @Override
    public void initializeStats() {
        // Set base attack, mana, and defense values for the Bard class
        this.attack = 5;
        mana = 15;
        this.defense = 7;

        // Customize character based on race
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
