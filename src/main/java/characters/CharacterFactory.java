package characters;

/**
 * The CharacterFactory class is responsible for creating instances of different
 * character classes based on input parameters. It encapsulates the logic for creating
 * specific types of characters without exposing the creation process to the client code.
 *
 * @author Elizabeth Akopov
 * @version 02.13.2024
 */
public class CharacterFactory {

    /**
     * Creates a new character instance based on the provided parameters.
     *
     * @param name           The name of the character.
     * @param sex            The sex of the character (male/female).
     * @param height         The height of the character (short/average/tall).
     * @param weight         The weight/build of the character (slim/average/large).
     * @param characterClass The class of the character (druid/bard/cleric/paladin/wizard).
     * @param characterRace  The race of the character (human/elf/orc/dwarf/tiefling).
     * @return The newly created character instance.
     * @throws IllegalArgumentException if an invalid character class is provided.
     */
    public Character createCharacter(String name, String sex,
                                     String height, String weight, String characterClass, String characterRace) {
        Character character;

        // Create character based on class
        switch (characterClass.toLowerCase()) {
            case "druid":
                character = new Druid(name, sex, height, weight, characterRace);
                break;
            case "bard":
                character = new Bard(name, sex, height, weight, characterRace);
                break;
            case "cleric":
                character = new Cleric(name, sex, height, weight, characterRace);
                break;
            case "paladin":
                character = new Paladin(name, sex, height, weight, characterRace);
                break;
            case "wizard":
                character = new Wizard(name, sex, height, weight, characterRace);
                break;
            default:
                throw new IllegalArgumentException("Invalid character class: " + characterClass);
        }

        return character;
    }
}
