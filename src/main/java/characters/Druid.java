package characters;

/**
 * The Druid class represents a character of the Druid class in the game.
 * Druids have unique stats and abilities based on their class and race.
 * They inherit from the Character class.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */
public class Druid extends Character {

    /**
     * Constructor to create a Druid character with specified attributes.
     *
     * @param name      The name of the Druid character.
     * @param sex       The sex of the Druid character (male/female).
     * @param height    The height of the Druid character (short/average/tall).
     * @param weight    The weight/build of the Druid character (slim/average/large).
     * @param characterRace The race of the Druid character (dwarf/elf/human/orc/tiefling).
     */
    public Druid(String name, String sex, String height, String weight, String characterRace) {
        super(name, sex, height, weight, "Druid", characterRace);
    }

    /**
     * Initializes the stats and abilities of the Druid character based on their class and race.
     * This method sets the attack, mana, defense, speed, and skill of the Druid character.
     * The values are determined based on the character's race.
     * Supported races include Dwarf, Elf, Human, Orc, and Tiefling.
     */
    @Override
    public void initializeStats() {
        this.attack = 8;
        mana = 12;
        this.defense = 7;

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
