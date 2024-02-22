package characters;

/**
 * The Paladin class represents a character of the Paladin class in the game.
 * Paladins have unique stats and abilities based on their class and race.
 * They inherit from the Character class.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */
public class Paladin extends Character {

    /**
     * Constructor to create a Paladin character with specified attributes.
     *
     * @param name      The name of the Paladin character.
     * @param sex       The sex of the Paladin character (male/female).
     * @param height    The height of the Paladin character (short/average/tall).
     * @param weight    The weight/build of the Paladin character (slim/average/large).
     * @param characterRace The race of the Paladin character (dwarf/elf/human/orc/tiefling).
     */
    public Paladin(String name, String sex, String height, String weight, String characterRace) {
        super(name, sex, height, weight, "Paladin", characterRace);
    }

    /**
     * Initializes the stats and abilities of the Paladin character based on their class and race.
     * This method sets the attack, mana, defense, speed, and skill of the Paladin character.
     * The values are determined based on the character's race.
     * Supported races include Dwarf, Elf, Human, Orc, and Tiefling.
     */
    @Override
    public void initializeStats() {
        this.attack = 14;
        mana = 2;
        this.defense = 14;

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
