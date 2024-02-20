package characters;

public class CharacterFactory {
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
